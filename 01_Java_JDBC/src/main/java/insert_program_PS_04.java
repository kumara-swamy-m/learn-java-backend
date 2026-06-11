import java.sql.*;
import java.util.Scanner;
public class insert_program_PS_04 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/back";
        String uname = "root";
        String pass = "yourpassword";
        String query = "insert into student values (?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname,pass);
        PreparedStatement st = con.prepareStatement(query); // PreparedStatement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter stu_name:");
        String stu_name=sc.nextLine();
        st.setInt(1, id);
        st.setString(2, stu_name);
        int count = st.executeUpdate();
        System.out.println(count + " row/s affected");

        st.close();
        con.close();
    }
}
