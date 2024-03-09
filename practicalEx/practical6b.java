import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class gui implements ActionListener{
	

	JTextArea t;
	JButton b;
	JFrame f;
	public gui(){

		 f =new JFrame();
		t =new JTextArea(10,10);
		b =new JButton("Select Color");
		JColorChooser c =new JColorChooser();
		
		FlowLayout ft =new FlowLayout();
		f.add(t);
		f.add(b);
	b.addActionListener(this);
		f.setLayout(ft);
		f.setSize(500,500);
		f.setVisible(true);
	
	}
		

		
	public void actionPerformed(ActionEvent e){
		Color c = JColorChooser.showDialog(f,"Select Color",Color.BLUE);
		t.setBackground(c);
		
	}
}



class practical6b {

	public static void main(String args[]){
		 gui d =new gui();
	}
}