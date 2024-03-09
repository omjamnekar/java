import javax.swing.*;
import java.awt.*;

class gui{

	
	public gui(){
	
	JFrame f =new JFrame();
	JButton b1 =new JButton("B1");

	JButton b2 =new JButton("B2");
	JButton b3 =new JButton("B3");
	JButton b4 =new JButton("B4"); 
	JButton b5 =new JButton("B5");	
	JButton b6 =new JButton("B6");

	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);

	GridLayout gt =new GridLayout(2,2,10,10);
	f.setLayout(gt);
	f.setSize(500,500);
	f.setVisible(true);	

	}	

	 

}


class practical7ai{

	public static void main(String args[]){
		
		gui g =new gui();
		
	}
	
}