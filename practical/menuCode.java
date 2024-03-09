import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MenuShow {

    public MenuShow() {

        JFrame f = new JFrame();
        JMenuBar bar = new JMenuBar();

        JMenu m1 = new JMenu("file");
        JMenu m2 = new JMenu("edit");
        f.setJMenuBar(bar);
        bar.add(m1);
        bar.add(m2);
        JMenuItem i = new JMenuItem("Menu");
        JMenuItem i1 = new JMenuItem("open");
        JMenuItem i2 = new JMenuItem("copy");
        JMenuItem i3 = new JMenuItem("Paste");
        m1.add(i);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

    }
}

class menuCode {

    public static void main(String[] args) {
        MenuShow d = new MenuShow();
    }
}