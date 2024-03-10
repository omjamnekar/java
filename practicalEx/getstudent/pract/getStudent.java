import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


class apple {
	
	DefaultTableModel tablrModel;
	JFrame f;
	JButton b1;
	public  apple(){
		try{

		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","system");
		Statement stml = con.createStatement();
		String sql ="select * from student ";

		ResultSet set= 	stml.executeQuery(sql);	

		while(set.next()){
		System.out.println(set.getString("rollno") + set.getString("name") +set.getString("address"));  
		

		}
	   }catch(Exception r){

			System.out.println(r);
		}
	}

	
}


class getStudent{


	public static void main(String args[]){

		apple df =new apple();	
	}
}
