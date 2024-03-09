import javax.swing.*;
import java.awt.*;

class gui{

	
	public gui(){
	
	JFrame f =new JFrame();


	JButton b2 =new JButton("North");
	JButton b3 =new JButton("South");
	JButton b4 =new JButton("East"); 
	JButton b5 =new JButton("West");
	JButton b6 =new JButton("Center");
	BorderLayout bt =new BorderLayout(10,10);
	
	f.add(b4,BorderLayout.EAST);
	f.add(b5,BorderLayout.WEST);
	f.add(b2,BorderLayout.NORTH);
	f.add(b3,BorderLayout.SOUTH);
	
	
	f.add(b6,BorderLayout.CENTER);

	
	f.setLayout(bt);
	f.setSize(500,500);
	f.setVisible(true);	

	}	

	 

}


class practical7ci{

	public static void main(String args[]){
		
		gui g =new gui();
		
	}
	
}