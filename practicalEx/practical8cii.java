import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class gui implements FocusListener{

	
	JButton b1;
	JLabel l1;
	
	public gui(){
		
		JFrame f =new JFrame();
		b1 =new JButton("Select");	
		l1 =new JLabel();
		f.add(l1);
		f.add(b1);
		FlowLayout ft =new FlowLayout();
		b1.addFocusListener(this);		
		f.setLayout(ft);
		f.setSize(500,500);
		f.setVisible(true);	
	
	}

	public void focusGained(FocusEvent e){

		l1.setText("Focus gained");
	}
	public void focusLost(FocusEvent e){

		l1.setText("Focus lossed");
	}


}


class practical8cii{


	public static void main(String args[]){

		gui b =new gui();

	}
}