import javax.swing.*;
import java.awt.*;

public class ButtonMessage {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Me");

        b.addActionListener(e -> {
            JOptionPane.showMessageDialog(f, "Button clicked!");
        });

        f.setLayout(new FlowLayout());
        f.add(b);

        f.setSize(250, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}