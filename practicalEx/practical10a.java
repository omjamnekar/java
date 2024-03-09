import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class innerClass extends JFrame{

	JLabel l1;
	public innerClass(){

		
	JTextField t1= new JTextField(10);
	l1 = new JLabel();
	addMouseListener(new mouseDemo());
	addWindowListener(new windowDemo());	
	add(l1);	
	add(t1);
	
	t1.addKeyListener(new keyDemo());
	FlowLayout ft =new FlowLayout();
	setLayout(ft);
	setSize(500,500);
		
	setVisible(true);
	
	}


	class mouseDemo extends MouseAdapter{

		public void mouseClicked(MouseEvent e){
			
			l1.setText("Mouse clicked");
		}
		public void mouseReleased(MouseEvent e){
			l1.setText("Mouse released");
		}
		public  void mousePressed(MouseEvent e){
			l1.setText("Mouse Pressed");
		}
		
	}




	class keyDemo extends KeyAdapter{

		public  void keyPressed(KeyEvent e){
			
			l1.setText("key Pressed");
		}
		public void  keyReleased(KeyEvent e){
			l1.setText("key Released");
		}
		public void keyTyped(KeyEvent e){
			l1.setText("key Typed");
		}
		
	}


	class windowDemo extends WindowAdapter{

		public void windowOpened(WindowEvent e){
			
			l1.setText("window Opened");
		}
		public void windowClosed(WindowEvent e){
			l1.setText("window Closed");
		}
		
		
	}

	 
}


class practical10a{

	public static void main(String args[]){
		innerClass f =new innerClass();
	}
}