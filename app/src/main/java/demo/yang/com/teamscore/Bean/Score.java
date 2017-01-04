package demo.yang.com.teamscore.Bean;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by y1247 on 2017/1/4 0004.
 */

public class Score extends BaseObservable {
    private int scoreA;
    private int scoreB;

    public void Reset(){
        setScoreA(0);
        setScoreB(0);
        notifyChange();
    }

    public String getScoreB() {
        String scoreB = String.valueOf(this.scoreB);
        return scoreB;
    }

    public int getintScoreB() {
        return scoreB;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
        notifyChange();
    }

    public Score() {
        this.scoreA = 0;
    }

    public String getScoreA() {
        String scoreA = String.valueOf(this.scoreA);
        return scoreA;
    }

    public int getintScoreA() {
        return scoreA;
    }

    public void setScoreA(int score) {
        this.scoreA = score;
        notifyChange();
    }

    public void addScoreA(int x){
        this.scoreA += x;
        notifyChange();
    }

    public void addScoreB(int x){
        this.scoreB += x;
        notifyChange();
    }

}
