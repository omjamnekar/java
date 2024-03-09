import javax.swing.*;

class DemoSwing {

    public DemoSwing() {

        JFrame f = new JFrame();
        JLabel l1 = new JLabel("Label 1:");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("Label 2:");
        JTextField t2 = new JTextField();
        JButton b = new JButton("Submit");

        f.setLayout(null);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        l1.setBounds(50, 50, 80, 20);
        t1.setBounds(150, 50, 200, 20);
        l2.setBounds(50, 100, 80, 20);
        t2.setBounds(150, 100, 200, 20);
        b.setBounds(150, 150, 100, 30);

        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
 class formGUI {

    public static void main(String args[]) {
        DemoSwing s = new DemoSwing();
    }
}
