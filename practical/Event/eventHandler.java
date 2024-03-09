import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class demoEvent implements ActionListener {

    JTextField t;
    JLabel l1;

    public demoEvent() {
        JFrame f = new JFrame();
        JButton b = new JButton("Submit");
        JLabel l = new JLabel("Enter name");
        l1 = new JLabel();
        t = new JTextField(10);

        b.addActionListener(this);

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(l1);
        f.setSize(500, 500);
        FlowLayout ft = new FlowLayout();

        f.setLayout(ft);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String str;
        str = t.getText();
        l1.setText("Name is " + str);

    }
}

class eventHandler {

    public static void main(String[] args) {
        demoEvent d = new demoEvent();
    }
}