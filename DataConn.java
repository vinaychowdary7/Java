import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class DataConn {
 
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/srkr123";
        String user = "root";
        String password = "";
  
        try {
        	//Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            
           // String sql = "INSERT INTO student VALUES ('1214','sandeep','34')";
            Statement statement = conn.createStatement();
 
//            String sql = "INSERT INTO student (id, name, age) values (?, ?, ?)";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, "1213");
//            statement.setString(2, "sandeep");
//            statement.setString(3, "35");

            
 //        String sql ="UPDATE student SET name='sai' WHERE id ='1214'";
//          PreparedStatement statement = conn.prepareStatement(sql);
//          statement.setString(1,"siva");
//          statement.setString(2,"1213");
            
          String sql ="Delete from student  WHERE id ='1214'";
//          PreparedStatement statement = conn.prepareStatement(sql);
//          statement.setString(1,"1213");

            //Statement
            int row = statement.executeUpdate(sql);
            //PreparedStatment
            //int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("Recode updated.");
            }
            else
            {
                System.out.println("Error");
            }
            conn.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
//        catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

    }
}