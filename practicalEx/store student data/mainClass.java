import java.sql.*;
import java.util.*;

class mainClass
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/divB","root","system");
			Statement st = con.createStatement();
			Scanner s = new Scanner(System.in);
			String name,address;
			int r;
			System.out.println("Enter student rno,name and address: ");
			r = s.nextInt();
			name = s.next();
			address = s.next();
			String sql = "INSERT INTO student VALUES("+r+",'"+name+"','"+address+"')";
			st.executeUpdate(sql);
			System.out.println("Data inserted successfully");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}