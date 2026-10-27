import javax.swing.*;

public class TreeDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTree Example");

        String[] data = {"Computer", "Java", "Python"};
        JTree tree = new JTree(data);

        f.add(new JScrollPane(tree));

        f.setSize(250, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}