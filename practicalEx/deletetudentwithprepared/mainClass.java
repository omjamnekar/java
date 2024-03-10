import java.sql.*;
import java.util.*;

class mainClass
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/divB","root","system");
			PreparedStatement st = con.prepareStatement("DELETE FROM student WHERE rollno=?");
			Scanner s = new Scanner(System.in);
			int r;
			System.out.println("Enter student rno: ");
			r = s.nextInt();
			st.setInt(1,r);
			st.executeUpdate();
			System.out.println("Data deleted successfully");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}