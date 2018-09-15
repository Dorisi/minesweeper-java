import javax.swing.JButton;
/**
 * 方块
 * @author Cherry
 *
 */
@SuppressWarnings("serial")
public class Bomb extends JButton {
    int num_x, num_y; // 第几号方块
    int BombRoundCount; // 周围雷数
    boolean isBomb; // 是否为雷
    boolean isClicked; // 是否被点击
    int BombFlag; // 探雷标记
    boolean isRight; // 是否点击右键
    
    public Bomb(int x, int y) {
        num_x = x;
        num_y = y;
        BombFlag = 0;
        BombRoundCount = 9;
        isBomb = false;
        isClicked = false;
        isRight = false;
    }
}
