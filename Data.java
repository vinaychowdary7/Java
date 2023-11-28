import java.sql.*;
class Data
{
    public static void main(String args[])
    {
     try 
      {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/21b91a54c0","root","");
        String sql="INSERT INTO student VALUES('1214','Sandeep','123456',20)";
        Statement statement=con.createStatement();
        int row=statement.executeUpdate(sql);
        if(row>0)
        {
            System.out.println("record updated");
        }  
        con.close();
      }
      catch(Exception ex)
      {
        ex.printStackTrace();
      }
    }
         
}