import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class gui implements KeyListener{
	
	JFrame f;
	JLabel l1;
	
	public gui() {
		f=new JFrame();
		l1 =new JLabel();
		JTextField t =new JTextField(10);		
		t.addKeyListener(this);	
		f.add(l1);
		f.add(t);
		FlowLayout ft =new FlowLayout();
		f.setVisible(true);
		f.setLayout(ft);
		f.setSize(500,500);		
	}


	public void keyPressed(KeyEvent e){
		
		l1.setText("Key Pressed");
	}
	public void keyTyped(KeyEvent e){
		
		l1.setText("Key Typed");
	}
	public void keyReleased(KeyEvent e){
		
		l1.setText("Key Released");
	}


}

class practical8ci{

	public static void main(String args[]){
		gui d =new gui();

	}
}