import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class sqlManager implements ActionListener{

	JFrame f;
	JButton b1;	
	JTextField t1;	
	JLabel l1;
	public sqlManager(){

		f =new JFrame();	
		b1 = new JButton("select");	
		t1= new JTextField(10);	
		l1 =new JLabel();	
		
		b1.addActionListener(this);
		f.add(b1);
		f.add(t1);	
		f.add(l1);
		FlowLayout ft =new FlowLayout();
		f.setLayout(ft);
	
		f.setSize(500,500);	
		f.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent eg){
			int r= Integer.parseInt(t1.getText());
	try{

		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","system");
		PreparedStatement stml = con.prepareStatement("select * from student where rollno =?");
		stml.setInt(1,r);	
		ResultSet result = stml.executeQuery();
		while(result.next()){
		l1.setText("Roll No: " + result.getString("rollno") +
                        ", Name: " + result.getString("name") +
                        ", Address: " + result.getString("address") +
                        " - Data fetched successfully");
		}
	
}	catch(Exception e){
		System.out.println(e);
}	
		
	} 
}



class practical5b{


	public static void main(String args[]){	
		sqlManager erf =new sqlManager();

	}
}