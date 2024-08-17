import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
      //  String sql="select id,name,dept,salary from employee";
       String sql = "insert into employee(id,name,dept,salary)" + "values(11,'ajay','Marketing',21000)";
      // String sql="update employee set salary=20000 where id=9";
      //String sql="delete from employee where id=4";

        String url = "jdbc:postgresql://localhost:5432/employeedb";
        String username = "postgres";
        String password = "cmrit";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
       // ResultSet rs = st.executeQuery(sql);
       // rs.next();
//        Integer id=rs.getInt(1);
//        String name= rs.getString(1);
//        String dept=rs.getString(2);
//        String salary=rs.getString(3);
//        System.out.println(id+" "+name+ " "+dept+ " "+salary);
      int insertedrow = st.executeUpdate(sql);
      System.out.println(insertedrow);
     // int updatedrow=st.executeUpdate(sql);
      //System.out.println(updatedrow);
    }
}