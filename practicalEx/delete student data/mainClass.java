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
			String address;
			int r;
			System.out.println("Enter student rno: ");
			r = s.nextInt();
			String sql = "DELETE FROM student WHERE rollno="+r;
			st.executeUpdate(sql);
			System.out.println("Data deleted successfully");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}