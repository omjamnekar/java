import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class clac implements ActionListener
{
JFrame f;
JLabel l1;
JLabel l2;
JLabel l3;
JButton b1;
JButton b2;
JButton b3;
JButton b4;
JTextField t1;
JTextField t2;



public clac()
{
f=new JFrame();
l1=new JLabel("Enter number");
l2=new JLabel("Enter number");
l3=new JLabel();
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton("/");
t1=new JTextField(10);
t2=new JTextField(10);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(l3);
FlowLayout ft=new FlowLayout();
f.setLayout(ft);
f.setSize(500,500);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
c=a+b;
l3.setText("Addition is:"+c);
}
if(e.getSource()==b2)
{
c=a-b;
l3.setText("Subtraction is:"+c);
}
if(e.getSource()==b3)
{
c=a*b;
l3.setText("Multiplication is:"+c);
}
if(e.getSource()==b4)
{
c=a/b;
l3.setText("Division is:"+c);
}


}
}
class demo
{
public static void main(String[] args)
{
clac o=new clac();
}
}