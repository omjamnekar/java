import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

class randomcolor implements ActionListener {
    JButton b;
    JTextArea t;
    JScrollPane js;

    public randomcolor() {
        JFrame f = new JFrame();
        t = new JTextArea();
        b = new JButton();

        js = new JScrollPane();
        b.addActionListener(this);
        f.add(js);
        f.add(b);
        FlowLayout ft = new FlowLayout();
        f.setLayout(ft);
        f.setVisible(true);
        f.setSize(500, 500);

    }

    public static int number = 0;

    public static Color randomColorGen() {
        Random r = new Random();

        int red = r.nextInt(256);
        int blue = r.nextInt(256);

        int green = r.nextInt(256);
        return new Color(red, green, blue);

    }

    public void actionPerformed(ActionEvent e) {
        t.setBackground(randomColorGen());
    }

}

class colorch {

    public static void main(String args[]) {
        int df = 4;
        randomcolor cd = new randomcolor();
        int sd = cd.number;
        System.out.println(sd);

    }
}
