import javax.swing.*;

class radioexample {

    public radioexample() {
        JFrame f = new JFrame();
        JLabel d = new JLabel("select gender");
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("FeMale");
        JButton b = new JButton("Submit");
        r1.setBounds(50, 50, 100, 15);
        d.setBounds(50, 1, 100, 15);
        r2.setBounds(50, 100, 100, 15);
        b.setBounds(50, 150, 100, 30);
        f.add(d);
        f.add(r1);
        f.add(r2);
        f.add(b);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

}

class example {

    public static void main(String args[]) {
        radioexample r = new radioexample();
    }

}