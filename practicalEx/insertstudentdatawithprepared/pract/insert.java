import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class SqlManager implements ActionListener{

	JFrame f;
	JButton b1;
	JLabel l1;
	JTextField t1,t2,t3;
	public SqlManager(){

		f=new JFrame();
		b1 = new JButton("Select");
		l1 =new JLabel();
		 t1 =new JTextField(10); 
		t2 =new JTextField(10);
		t3 =new JTextField(10);
		f.add(b1);	
		f.add(l1);	
		f.add(t1);
		f.add(t2);
		f.add(t3);
		b1.addActionListener(this);
		f.setLayout(new FlowLayout());		
		f.setSize(500,500);
		f.setVisible(true);	
		
		
		
	}


	public void actionPerformed(ActionEvent e){
		
	try{

		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","system");	
		PreparedStatement stml  = con.prepareStatement("insert into student values(?,?,?)");	
		stml.setInt(1,Integer.parseInt(t1.getText()));
stml.setString(2,t2.getText());
stml.setString(3,t3.getText());
		stml.executeUpdate();
		
		System.out.println("Inserted successfully");	
	
	
		}catch(ClassNotFoundException | SQLException v){

		System.out.println(v);
		}
		
	}
}


class insert {


	public static void main(String args[]){

		SqlManager df =new SqlManager();

}
}