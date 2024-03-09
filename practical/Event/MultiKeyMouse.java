
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class keyMouseManger implements KeyListener, MouseListener {

    JTextField t1;
    JLabel l1;

    public keyMouseManger() {
        JFrame f = new JFrame();
        t1 = new JTextField(20);
        l1 = new JLabel();

        t1.setBounds(50, 50, 100, 100);
        l1.setBounds(50, 100, 100, 100);
        t1.addKeyListener(this);
        f.addMouseListener(this);

        FlowLayout ft = new FlowLayout();
        f.setLayout(ft);

        f.add(t1);
        f.add(l1);

        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }

    public void mouseClicked(MouseEvent e) {

        l1.setText("Mouse Click");
    }

    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }

    public void keyTyped(KeyEvent e) {
        l1.setText("Key is Typed");
    }

    public void keyPressed(KeyEvent e) {
        l1.setText("Key is Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l1.setText("Key is Released");
    }
}

class MultiKeyMouse {
    public static void main(String[] args) {
        keyMouseManger d = new keyMouseManger();
    }
}