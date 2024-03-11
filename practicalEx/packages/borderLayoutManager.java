import javax.swing.*;
import java.awt.*;

class gui {



		public gui(){

		JFrame f =new JFrame();
		JButton b1 =new JButton("datta");
		JButton b2 =new JButton("datta");
		JButton b3 =new JButton("datta");
		JButton b4 =new JButton("datta");
		
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.setLayout(new BorderLayout());
		f.setSize(500,500);	
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	
				
	}
	
		
}


class borderLayoutManager{

		public static void main(String args[]){

		gui s =new gui();

	}
}