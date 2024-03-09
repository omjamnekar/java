
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class demoEvent implements ActionListener {

    JTextField t1;
    JLabel l2;

    public demoEvent() {

        JFrame f = new JFrame();
        JButton b = new JButton("Calculate");
        JLabel l1 = new JLabel();
        t1 = new JTextField(10);
        l2 = new JLabel("");
        b.addActionListener(this);
        f.add(l1);
        f.add(t1);
        f.add(b);
        f.add(l2);
        f.setSize(500, 500);
        FlowLayout f1 = new FlowLayout();
        f.setLayout(f1);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int ans = 1;
        int value = Integer.parseInt(t1.getText());

        for (int i = value; i >= 1; i--) {
            ans = i * ans;
        }
        l2.setText("Factorial is " + ans);

    }

}

class factorial {

    public static void main(String[] args) {
        demoEvent d = new demoEvent();
    }
}