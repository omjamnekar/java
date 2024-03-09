import javax.swing.*;
class GuiMethod{

	
   public GuiMethod(){

	JFrame f=new JFrame();
	JLabel l =new JLabel("Enter name");

	JLabel l2 =new JLabel("Enter age"); 
	JTextField t1 =new JTextField();
	JTextField t2 =new JTextField();
	JButton b =new JButton("Click me");
	
	l.setBounds(50,50,60,60);	
	t1.setBounds(100,50,100,100);	
	b.setBounds(20,20,20,20);
	l2.setBounds(100,100,100,100);
	t2.setBounds(100,100,100,100);

	f.add(l);
	f.add(t1); 	
	f.add(l2); 
	f.add(t2);	
	f.add(b);
	f.setSize(500,500);	
	f.setVisible(true);	
	
   }
}


public class GuiAdd{

	public static void main(String args[]){
		GuiMethod  s =new GuiMethod();
		
	}
}