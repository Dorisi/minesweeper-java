import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bomb_actionAdapter implements ActionListener {
    private Frame adaptee;
    Bomb_actionAdapter(Frame adaptee) {
        this.adaptee = adaptee;
    }
    
    public void actionPerformed(ActionEvent e) {
        adaptee.actionPerformed(e);
    }
	
}
