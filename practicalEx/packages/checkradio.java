import javax.swing.*;
import java.awt.*;

class DC{
	public DC(){

	JCheckBox v =new JCheckBox("male",false);

	JCheckBox v1 =new JCheckBox("female",true);	
		
	JRadioButton b1 =new JRadioButton("GOOD",false);	
	
JRadioButton b2 =new JRadioButton("BAD",true);

		JFrame f =new JFrame();
		f.add(v);
f.add(v1);
f.add(b1);
f.add(b2);
			f.setLayout(new FlowLayout());	
	
			f.setSize(500,500);	
			f.setVisible(true);		

		
		}



}



class checkradio{

	public static void main(String args[]){

		DC sd =new DC();
}
}


