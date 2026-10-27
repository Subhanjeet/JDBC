import javax.swing.*;
import java.awt.*;

public class LanguageCombo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Languages");

        String[] languages = {
            "English", "Marathi", "Hindi", "Sanskrit"
        };

        JComboBox<String> cb = new JComboBox<>(languages);

        f.setLayout(new FlowLayout());
        f.add(new JLabel("Select language:"));
        f.add(cb);

        f.setSize(300, 120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}