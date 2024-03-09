import java.awt.Color;

import javax.swing.*;

class panelDemo {

    public panelDemo() {

        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton b = new JButton("Button1");

        JButton b2 = new JButton("Button 2");

        p.setBackground(Color.CYAN);
        b.setBackground(Color.RED);
        b2.setBackground(Color.yellow);

        b.setBounds(40, 40, 100, 50);
        b2.setBounds(200, 40, 110, 50);
        p.setBounds(40, 20, 300, 200);
        f.add(p);
        f.add(b);
        f.add(b2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}

class colorset {

    public static void main(String[] args) {
        panelDemo s = new panelDemo();
    }
}