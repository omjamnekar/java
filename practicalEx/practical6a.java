import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class gui implements ActionListener{
	JTextArea t;
	JButton b;
	
	public gui(){

		t =new JTextArea(10,10);
		JFrame f =new JFrame();
		b =new JButton("Change");
		
		FlowLayout ft =new FlowLayout();
		b.addActionListener(this);
		f.add(t);
		f.add(b);
		f.setLayout(ft);	
		f.setSize(500,500);
		f.setVisible(true);
		
	}
	
	public Color colorGenerator(){
		Random r =new Random();	

		int red ,blue,green;
		
		red =r.nextInt(225);
		
		blue =r.nextInt(225);

		green =r.nextInt(225);

	return new Color(red ,blue, green);
	
	}

	public void actionPerformed(ActionEvent e){
	
		t.setBackground(colorGenerator());	
	}

	
}


class practical6a{
	
	public static void main(String args[]){

		gui d=new gui();
	}
}