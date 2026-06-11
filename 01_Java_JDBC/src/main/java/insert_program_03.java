import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_program_03 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/back";
        String uname = "root";
        String pass = "yourpassword";
       int id =4;
       String stu_name="Mayur";

        String query = "insert into  student values ("+ id +",'"+ stu_name + "')";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        int count =st.executeUpdate(query);
        System.out.println(count+" row/s affected");
        st.close();
        con.close();




    }
}
