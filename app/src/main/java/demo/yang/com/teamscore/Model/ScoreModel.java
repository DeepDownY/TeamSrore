package demo.yang.com.teamscore.Model;

import demo.yang.com.teamscore.Bean.Score;

/**
 * Created by y1247 on 2017/1/4 0004.
 */

public class ScoreModel implements IScoreModel {
    @Override
    public Score getScore() {
        return new Score();
    }
}
