import java.sql.*;
public class fetch_program_01 {
    public static void main(String[] args) throws  Exception{
        String url = "jdbc:mysql://localhost:3306/back";
        String uname = "root";
        String pass = "yourpassword";
        String query = "select stu_name from student where id=1";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        System.out.println(rs.getString("stu_name"));
        st.close();
        con.close();


    }
}
