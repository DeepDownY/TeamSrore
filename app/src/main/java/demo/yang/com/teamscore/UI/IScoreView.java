package demo.yang.com.teamscore.UI;

import demo.yang.com.teamscore.Bean.Score;

/**
 * Created by y1247 on 2017/1/4 0004.
 */

public interface IScoreView {
    void setScore(Score score);
    void changeAScore(int x);
    void changeBScore(int x);
    void resetScore();
}
