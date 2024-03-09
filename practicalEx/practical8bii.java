import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
class mouseManager implements MouseMotionListener{

	JFrame f;
	JLabel l1;
	public  mouseManager()
	{
		f=new JFrame();
		l1 =new JLabel();
f.addMouseMotionListener(this);
		f.add(l1);
		FlowLayout ft =new FlowLayout();
		f.setLayout(ft);	
		f.setSize(500,500);
		f.setVisible(true);
		

	}
	
	public void mouseDragged(MouseEvent e){
		Graphics g = f.getGraphics();
		g.setColor(Color.RED);
		g.fillOval(e.getX(),e.getY(), 5,5);		
		
	}
	
	public void mouseMoved(MouseEvent e){

		l1.setText("x="+e.getX()+" "+"y ="+ e.getY());
	}

}

class practical8bii{

	public static void main(String args[]){

		mouseManager sd= new mouseManager();
	}
}
