import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class gui implements MouseListener{
	
	JLabel l1; 
	
	public gui(){
		
		JFrame f =new JFrame();
		f.addMouseListener(this); 
		l1 =new JLabel();
		f.add(l1);
		FlowLayout ft =new FlowLayout();
		f.setLayout(ft);
		f.addMouseListener(this);
		f.setSize(500,500);
		f.setVisible(true);	
		
	}

	public void mousePressed(MouseEvent e){
		l1.setText("mouse Pressed");
	}
	public void  mouseReleased(MouseEvent e){
		l1.setText("mouse Released");
	}
	public void mouseExited(MouseEvent e){
		l1.setText("mouse Exited");
	}
	public void mouseEntered(MouseEvent e){
		l1.setText("mouse Entered");
	}
	public void mouseClicked(MouseEvent e){
		l1.setText("mouse Clicked");
	}
	
}


class practical8bi{

		public static void main(String arg[]){

		gui s =new gui();

}
}