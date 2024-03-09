import java.sql.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class abc implements ActionListener

{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b1;

    public abc() {
        JFrame f = new JFrame();
        l1 = new JLabel("Enter roll no:");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter name:");
        t2 = new JTextField(10);
        l3 = new JLabel("Enter address:");
        t3 = new JTextField(10);
        l4 = new JLabel();
        b1 = new JButton("Insert");
        b1.addActionListener(this);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(l4);
        f.setSize(250, 250);
        FlowLayout ft = new FlowLayout();
        f.setLayout(ft);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "system");
            Statement st = con.createStatement();
            Scanner s = new Scanner(System.in);
            String address, name;
            int rno;
            rno = Integer.parseInt(t1.getText());
            name = t2.getText();
            address = t3.getText();

            String str = "insert into student values(" + rno + ",'" + name + "','" + address + "')";
            st.executeUpdate(str);
            l4.setText("Inserted");
            con.close();

        } catch (Exception es) {
            System.out.println(es);
        }

    }

}

class display

{
    public static void main(String args[])

    {
        abc a = new abc();

    }
}
