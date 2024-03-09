import javax.swing.*;
import java.awt.*;

class demoButton {

    public demoButton() {
        JFrame f = new JFrame();
        JButton b = new JButton("Submit");
        JButton b1 = new JButton("Submit");
        JButton b2 = new JButton("Submit");
        JButton b4 = new JButton("Submit");

        f.add(b);
        f.add(b1);
        f.add(b2);

        f.add(b4);
        GridLayout ft = new GridLayout(2, 2, 10, 10);
        f.setSize(200, 200);
        f.setLayout(ft);

        f.setVisible(true);
    }
}

class gridLayout1 {

    public static void main(String[] args) {
        demoButton d = new demoButton();
    }
}