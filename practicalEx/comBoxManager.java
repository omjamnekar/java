import javax.swing.*;
import java.awt.*;


class gui{

	public gui(){

		JFrame f =new JFrame();	

		String arf[] ={"file","open","close","start"};	
		JComboBox com  = new JComboBox(arf);	
	
		com.setBounds(100,200,200,200);	
		f.setLayout(null);
	
		f.setSize(500,500);
		f.setVisible(true);
	}
	
}




class comBoxManager{

	public static void main(String args[]){
 		gui d =new gui();
		
	}
}