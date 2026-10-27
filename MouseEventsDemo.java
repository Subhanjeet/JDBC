import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame
        implements MouseListener {

    MouseEventsDemo() {
        setTitle("Mouse Events");
        setSize(400, 300);
        addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        setBackground(Color.YELLOW);
    }

    public void mousePressed(MouseEvent e) {
        setBackground(Color.RED);
    }

    public void mouseReleased(MouseEvent e) {
        setBackground(Color.GREEN);
    }

    public void mouseEntered(MouseEvent e) {
        setBackground(Color.CYAN);
    }

    public void mouseExited(MouseEvent e) {
        setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        new MouseEventsDemo();
    }
}