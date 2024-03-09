import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculate implements ActionListener {


	
	JLabel l1; 
	JLabel l2; 
	JLabel l3;	
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;

	JTextField t1;
		
	JTextField t2;
	

	public calculate(){

		t1 =new JTextField(10);
		t2 =new JTextField(10);
		JFrame f= new JFrame();
	
		l1 =new JLabel("Enter number 1:");
		l2 =new JLabel("Enter number 2:");
		l3 =new JLabel();
		b1= new JButton("ADD");
		b2= new JButton("SUB");
		b3= new JButton("DIV");
		b4= new JButton("MUL");
		
		FlowLayout ft =new FlowLayout();	
			f.add(l1);
			f.add(t1);
			f.add(l2);	
			f.add(t2);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);	
			f.add(l3);
		b1.addActionListener(this);	
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		b4.addActionListener(this);	
		f.setLayout(ft);

		f.setSize(500,500);
		f.setVisible(true);
	}	

	public void actionPerformed(ActionEvent e){
		int a,b,c;
		a =Integer.parseInt(t1.getText());
		b =Integer.parseInt(t2.getText());
		if(e.getSource() == b1){

		// add
		
			c =b+a;
				
		}else if(e.getSource() == b2){
// sub
		
			c =b-a;

}
		
		else if(e.getSource() == b3){
// mul

			c =a*b;

}
else{

	// add
	
			c =b/a;

}
		l3.setText(Integer.toString(c));			
	}
}



class practical8ai{


	public static void main(String args[]){
calculate cal =new calculate();

		
	}
}