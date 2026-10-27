import javax.swing.*;
import java.awt.*;

public class AddNumbers {
    public static void main(String[] args) {
        JFrame f = new JFrame("Addition");

        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);
        JButton b = new JButton("Add");
        JLabel result = new JLabel("Result: ");

        b.addActionListener(e -> {
            try {
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());

                result.setText("Result: " + (a + c));
            } catch (NumberFormatException ex) {
                result.setText("Enter valid numbers");
            }
        });

        f.setLayout(new FlowLayout());

        f.add(new JLabel("First:"));
        f.add(t1);
        f.add(new JLabel("Second:"));
        f.add(t2);
        f.add(b);
        f.add(result);

        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}