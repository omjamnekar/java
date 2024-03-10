import java.sql.*;

class mainClass
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/divB","root","system");
			PreparedStatement st = con.prepareStatement("SELECT * FROM student");
			ResultSet rs = st.executeQuery();
			while(rs.next())
				System.out.println(rs.getInt(1)+" '"+rs.getString(2)+"' '"+rs.getString(3)+"'");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}