import java.awt.*;

import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

class SqlManager implements ActionListener { 
		
	JButton b1;
	DefaultTableModel tableModel;
	
	public SqlManager(){
		b1 =new JButton("Select");
		JFrame  f= new JFrame(); 
		tableModel  = new DefaultTableModel();
		tableModel.addColumn("rollno");
		tableModel.addColumn("name");
		tableModel.addColumn("address");
		JTable table =new JTable(tableModel);	
		JScrollPane js = new JScrollPane(table);	
		f.add(b1);	
		f.add(js);
		b1.addActionListener(this);	
		FlowLayout ft =new FlowLayout();	
		f.setLayout(ft);
		f.setSize(500,500);	
		f.setVisible(true);
	}
	
	public void  actionPerformed(ActionEvent eg){

		try{
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","system");	
	
	Statement stmt =con.createStatement();

	String sql ="select * from student";
	ResultSet result =stmt.executeQuery(sql);	 
		while(result.next()){
	
			String rollno = result.getString("rollno");
			String name = result.getString("name");
			String address = result.getString("address");
			tableModel.addRow(new Object[]{rollno ,name, address});
		}
		}catch(Exception e){
			System.out.println(e);
		}	
	
	} 
}



class practicalsql{

	
	public static void main(String args[]){

		SqlManager d =new SqlManager();
		System.out.println("hello world");
	}
}