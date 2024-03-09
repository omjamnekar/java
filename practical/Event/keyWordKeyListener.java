
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class keyBoardManager implements KeyListener {
    JTextField t1;
    JLabel l1;

    public keyBoardManager() {
        JFrame f = new JFrame();
        l1 = new JLabel();
        t1 = new JTextField();
        JLabel l2 = new JLabel("Enter word");
        t1.addKeyListener(this);
        l1.setBounds(50, 50, 100, 100);
        f.add(l2);
        f.add(t1);
        f.add(l1);
        FlowLayout ft = new FlowLayout();
        f.setSize(500, 500);
        f.setLayout(ft);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added for proper window closure
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

class keyWordKeyListener {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new keyBoardManager();
        });
    }
}
