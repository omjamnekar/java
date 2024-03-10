import java.sql.*;
import java.util.*;

class mainClass
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/divB","root","system");
			PreparedStatement st = con.prepareStatement("UPDATE student SET address=? WHERE rollno=?");
			Scanner s = new Scanner(System.in);
			String address;
			int r;
			System.out.println("Enter student rno and address: ");
			r = s.nextInt();
			address = s.next();
			st.setInt(2,r);
			st.setString(1,address);
			st.executeUpdate();
			System.out.println("Data updated successfully");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}