import java.awt.*;
import javax.swing.*;

class gui {


	public gui(){
		JFrame f=new JFrame();
		JMenuBar menuBar =new JMenuBar();
		///
		
		JMenu m1= new JMenu("files");	
		JMenu m2= new JMenu("menu");	
		// 
		JMenuItem t1 =new JMenuItem("menu");
		JMenuItem t2= new JMenuItem("open");	
		JMenuItem t3= new JMenuItem("copy");
		JMenuItem t4= new JMenuItem("paste");
			

		//

		m1.add(t1);
m1.add(t2);
m2.add(t3);
m2.add(t4);

		//
		menuBar.add(m1);
		menuBar.add(m2);
		//
f.setJMenuBar(menuBar);
		f.setLayout(null);
		f.setSize(500,500);		
		f.setVisible(true);
		

		
	}
}


class MenuManager{ 

		public static void main(String args[]){
			gui b = new gui();
		}

}