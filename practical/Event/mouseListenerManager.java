import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventDemo implements MouseListener {

    JLabel l1;

    public MouseEventDemo() {
        JFrame f = new JFrame();
        l1 = new JLabel();
        TextField t1 = new TextField();
        f.add(l1);
        l1.setBounds(50, 50, 100, 100);
        FlowLayout ft = new FlowLayout();
        f.addMouseListener(this);
        f.setLayout(ft);
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

}

class mouseListenerManager {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MouseEventDemo();
        });

    }
}