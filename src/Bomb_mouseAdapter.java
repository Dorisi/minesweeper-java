import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bomb_mouseAdapter extends MouseAdapter {
    private Frame adaptee;
    Bomb_mouseAdapter(Frame adaptee) {
        this.adaptee = adaptee;
    }
    
    public void mouseClicked(MouseEvent e) {
        adaptee.mouseClicked(e);
    }
}
