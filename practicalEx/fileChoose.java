import javax.swing.JFileChooser;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


class FileManager implements ActionListener{

	JButton b1;
	
	public FileManager(){
		JFrame f =new JFrame();
		b1 =new JButton(); 
		b1.addActionListener(this);
		f.add(b1);
		FlowLayout ft=new FlowLayout();	
		f.setLayout(ft);
		f.setSize(500,500);	
		f.setVisible(true);
		
	
	}


	public void actionPerformed(ActionEvent e){

		JFileChooser f1 =new JFileChooser("D:");	
		f1.showSaveDialog(null);
	}

}


class fileChoose{


	public static void main(String args[]){

		FileManager g =new FileManager();
	}
}