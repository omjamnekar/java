import javax.swing.*;
import java.awt.*;

class borderDemo {

    public borderDemo() {

        JFrame f = new JFrame();
        BorderLayout l = new BorderLayout();
        f.setLayout(l);

        JButton b = new JButton("Button1");
        JButton b1 = new JButton("Button2");
        JButton b2 = new JButton("Button3");
        JButton b3 = new JButton("Button4");
        JButton b4 = new JButton("Button5");

        f.add(b, BorderLayout.NORTH);
        f.add(b1, BorderLayout.WEST);
        f.add(b2, BorderLayout.CENTER);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.PAGE_END);

        f.setSize(500, 500);
        f.setVisible(true);

    }

}

class borderlayout1 {

    public static void main(String[] args) {
        borderDemo s = new borderDemo();

    }
}