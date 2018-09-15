import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame_start_actionAdapter implements ActionListener {
    private Frame adaptee;
    Frame_start_actionAdapter(Frame adaptee) {
        this.adaptee = adaptee;
    }
    
    public void actionPerformed(ActionEvent e) {
        adaptee.start_actionPerformed(e);
    }
}
