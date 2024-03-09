import javax.swing.*;
class passModeon{

	
	public passModeon(){

	JFrame f = new JFrame();

	JLabel l1 =new JLabel("Enter address");	
	JTextField t =new JTextField();
	JLabel l2 =new JLabel();
	JPasswordField p =new JPasswordField();
	JRadioButton r =new JRadioButton("select");
	
	JButton b =new JButton();
		
f.add(l1); 
f.add(t);
f.add(l2); 
f.add(p);
f.add(r);
f.add(b); 
	p.setBounds(100,210,105,105);
	r.setBounds(100,100,100,100);	
f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	
	 
	}
}


class passWord{

	public static void main(String args[]){

	passModeon d =new passModeon();
}
}