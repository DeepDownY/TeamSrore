package demo.yang.com.teamscore.Presentor;

import demo.yang.com.teamscore.Bean.Score;
import demo.yang.com.teamscore.Model.IScoreModel;
import demo.yang.com.teamscore.Model.ScoreModel;
import demo.yang.com.teamscore.UI.IScoreView;

/**
 * Created by y1247 on 2017/1/4 0004.
 */

public class ScorePre {

    private IScoreView scoreView;
    private IScoreModel scoreModel;

    public ScorePre(IScoreView scoreView) {
        this.scoreView = scoreView;
        scoreModel = new ScoreModel();
    }

    public void resetScore(){
        scoreView.resetScore();
    }

    public void changeAScore(int x){
        scoreView.changeAScore(x);
    }

    public void changeBScore(int x){
        scoreView.changeBScore(x);
    }

    public void setScore(){
        scoreView.setScore(scoreModel.getScore());
    }
}
