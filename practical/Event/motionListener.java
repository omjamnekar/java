import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class mouseMotion implements MouseMotionListener {
    JLabel l1;
    JFrame f;

    public mouseMotion() {
        f = new JFrame();
        l1 = new JLabel();
        l1.setBounds(50, 50, 100, 50);
        f.add(l1);
        f.addMouseMotionListener(this);
        f.setSize(500, 500);
        FlowLayout ft = new FlowLayout();
        f.setLayout(ft);
        f.setVisible(true);

    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 30, 30);

    }

    public void mouseMoved(MouseEvent e) {

        l1.setText("X= " + e.getX() + "Y= " + e.getY());
    }

}

class motionListener {

    public static void main(String[] args) {
        mouseMotion d = new mouseMotion();
    }
}