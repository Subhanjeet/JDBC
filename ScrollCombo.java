import javax.swing.*;
import java.awt.*;

public class ScrollCombo {
    public static void main(String[] args) {
        JFrame f = new JFrame("ScrollPane and ComboBox");
        f.setLayout(new FlowLayout());

        JTextArea area = new JTextArea(5, 15);
        JScrollPane sp = new JScrollPane(area);

        String[] items = {"One", "Two", "Three"};
        JComboBox<String> cb = new JComboBox<>(items);

        f.add(sp);
        f.add(cb);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
