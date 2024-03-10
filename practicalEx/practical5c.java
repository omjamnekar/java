import java.sql.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class sqlManager implements ActionListener{

	JFrame f;
	JButton b,b1;
	JLabel l1;
	ResultSet rs;

	public sqlManager(){
		f =new JFrame();
		b =new JButton("Previous");
		b1 = new JButton("Next");	
		l1 =new JLabel();

		b.addActionListener(this);
		b1.addActionListener(this);	
		f.add(b);
		f.add(l1);		
		f.add(b1);
		FlowLayout ft =new FlowLayout();	
	f.setLayout(ft);
	f.setSize(500,500);	
	f.setVisible(true);	
		
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","system");	
			Statement stml = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "select * from student";
			rs =stml.executeQuery(sql);
		}	
		catch(ClassNotFoundException | SQLException ej){
			System.out.println(ej);
		}
		

	} 

public void actionPerformed(ActionEvent e){
				
			try{
			if(e.getSource() == b){
				if(rs.previous()){

					data();
				}	
			}
			else if(e.getSource() == b1){
if(rs.next()){

					data();
				}}
			

			}catch(SQLException eg){

		System.out.println(eg);
				
			}
			
		}
		
	public void data(){
try{
	l1.setText(rs.getString("name"));
}catch(SQLException gg){
		System.out.println(gg);
	}
			
		}

	
}


class  practical5c{


	public static void main(String args[]){
		sqlManager de =new sqlManager();	
}

}