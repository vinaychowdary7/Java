import java.sql.*;

class Ex13_1 {
	public static void main(String args[]) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/21b91a54c0", "root", "");
			Statement stmt = con.createStatement();
			String sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				System.out.println(rs.getString(1) + "  " + rs.getString(2)+" "+rs.getString(3) + "  " + rs.getString(4) );	
			}
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}