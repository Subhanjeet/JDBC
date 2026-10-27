import java.awt.*;
import java.awt.event.*;

public class AWTComponents {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Components");
        f.setLayout(new FlowLayout());

        Label l = new Label("Enter your name:");
        TextField t = new TextField(15);
        Button b = new Button("Show");

        b.addActionListener(e -> {
            l.setText("Hello, " + t.getText());
        });

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(300, 150);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setVisible(true);
    }
}