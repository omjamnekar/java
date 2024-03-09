import javax.swing.*;

import java.awt.*;

class demoButton{

	
public demoButton(){
	JFrame f = new JFrame();
	JButton b=new JButton("Submit");
	JButton b1 =new JButton("Submit");	
	JButton b2 =new JButton("Submit");	
	f.add(b);
	f.add(b1);	
	f.add(b2);	
	FlowLayout f1 =new FlowLayout(FlowLayout.LEFT,10,10); 
	f.setSize(500,500); 
f.setLayout(f1 
f.setVisible(true);
	}
}


class flowL{

	public static void main(String args[]){

	demoButton d =new demoButton();
	}
}