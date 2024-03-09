import javax.swing.*;

class comboComponent {

    public comboComponent() {

        JFrame f = new JFrame();
        String str[] = { "Pune", "Mumbai", "Delhi", "Banglore", "Kerala" };

        JComboBox cb = new JComboBox(str);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);

    }
}

class comboBox {

    public static void main(String[] args) {
        comboComponent c = new comboComponent();
    }
}