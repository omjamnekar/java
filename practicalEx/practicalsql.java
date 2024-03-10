import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;


class sqlManager implements ActionListener{
	
	JFrame f;
	JButton b1;
	DefaultTableModel tableModel;
	
	public sqlManager(){
		f= new JFrame();
		tableModel = new DefaultTableModel();
		b1 =new JButton("Select");	
		tableModel.addColumn("rollno");
		tableModel.addColumn("name");
		tableModel.addColumn("address");			

		JTable table =new JTable(tableModel);	
		JScrollPane js =new JScrollPane(table);
		b1.addActionListener(this);
		f.add(b1);			
		f.add(js);	
		FlowLayout ft =new FlowLayout(FlowLayout.LEFT);
		f.setLayout(ft);
		f.setSize(500,500);	
		f.setVisible(true);


	}

	public void actionPerformed(ActionEvent ed){

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","system");	
		Statement stmt =con.createStatement();
		String sql ="select * from student";
		ResultSet result  =stmt.executeQuery(sql);	
			while(result.next()){
				String  rollno= result.getString("rollno");
				String  name= result.getString("name");
				String  address= result.getString("address");	
				tableModel.addRow(new Object[]{rollno, name, address});
			}
		}catch(Exception e){

			System.out.println(e);
	}
		
	}
}


class practicalsql{

	public static void main(String args[]){
		sqlManager sd =new sqlManager();
	}
}