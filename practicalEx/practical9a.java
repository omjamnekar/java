import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class gui extends WindowAdapter implements KeyListener{

	JFrame f;
	JTextField t1;
	JLabel l1;
	JLabel l2;

	public gui(){

		f =new JFrame();
		l1 =new JLabel ("Write");
		l2 =new JLabel();
		t1 =new JTextField(10);
	//	""
		f.add(l1);
		f.add(t1);
		f.add(l2);
		FlowLayout ft =new FlowLayout();
		f.setLayout(ft); 

		f.addWindowListener(this);
		t1.addKeyListener(this);

		f.setSize(500,500);	
		f.setVisible(true);
	}	

	public void  windowOpened(WindowEvent e){
		System.out.println("Window open");
		}


	public void  windowClosed(WindowEvent e){
		System.out.println("Window Closed"); 

		}

	
	public void  keyPressed(KeyEvent e){
		l2.setText("Key pressed");
		}
	
	public void  keyReleased(KeyEvent e){
		l2.setText("Key Release");
		}


	public void  keyTyped(KeyEvent e){
		l2.setText("Key Typed");
		}


	
}

class practical9a{


	public static void main(String args[]){


		gui f =new gui();

	}
}