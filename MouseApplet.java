import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseApplet extends JFrame {
    MouseApplet() {
        setTitle("Mouse Click Background");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseApplet();
    }
}