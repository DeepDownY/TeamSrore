package demo.yang.com.teamscore.UI;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import demo.yang.com.teamscore.Bean.Score;
import demo.yang.com.teamscore.Presentor.ScorePre;
import demo.yang.com.teamscore.R;
import demo.yang.com.teamscore.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements IScoreView,View.OnClickListener {

    private ActivityMainBinding binding;

    ScorePre  scorePre;

    Score score;

    Button bu_AFreeThrow,bu_ATwoPoint,bu_AThreePoint,
            bu_BFreeThrow,bu_BTwoPoint,bu_BThreePoint;
    Button bu_Reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        bu_AFreeThrow = (Button) findViewById(R.id.bu_AFreeThrow);
        bu_AFreeThrow.setOnClickListener(this);
        bu_ATwoPoint = (Button) findViewById(R.id.bu_ATwoPoint);
        bu_ATwoPoint.setOnClickListener(this);
        bu_AThreePoint = (Button) findViewById(R.id.bu_AThreePoint);
        bu_AThreePoint.setOnClickListener(this);

        bu_BFreeThrow = (Button) findViewById(R.id.bu_BFreeThrow);
        bu_BFreeThrow.setOnClickListener(this);
        bu_BTwoPoint = (Button) findViewById(R.id.bu_BTwoPoint);
        bu_BTwoPoint.setOnClickListener(this);
        bu_BThreePoint = (Button) findViewById(R.id.bu_BThreePoint);
        bu_BThreePoint.setOnClickListener(this);

        bu_Reset = (Button) findViewById(R.id.bu_Reset);
        bu_Reset.setOnClickListener(this);

        scorePre = new ScorePre(this);
        scorePre.setScore();
    }

    @Override
    public void setScore(Score score) {
        this.score = score;
        binding.setScore(this.score);
    }

    @Override
    public void changeAScore(int x) {
        this.score.addScoreA(x);
    }

    @Override
    public void changeBScore(int x) {
        this.score.addScoreB(x);
    }

    @Override
    public void resetScore() {
        this.score.Reset();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bu_AFreeThrow:
                scorePre.changeAScore(1);
                break;
            case R.id.bu_ATwoPoint:
                scorePre.changeAScore(2);
                break;
            case R.id.bu_AThreePoint:
                scorePre.changeAScore(3);
                break;
            case R.id.bu_BFreeThrow:
                scorePre.changeBScore(1);
                break;
            case R.id.bu_BTwoPoint:
                scorePre.changeBScore(2);
                break;
            case R.id.bu_BThreePoint:
                scorePre.changeBScore(3);
                break;
            case R.id.bu_Reset:
                scorePre.resetScore();
        }
    }
}
