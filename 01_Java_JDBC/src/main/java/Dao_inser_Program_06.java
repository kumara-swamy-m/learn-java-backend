import java.sql.*;
public class Dao_inser_Program_06 {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.id =9;
        s1.stu_name="Ram";
        AddDao dao = new AddDao();
        dao.addStudent(s1);
    }
}
class AddDao{
    public void addStudent(Stu s1){
        try{

            String query = "insert into student values (?,?)";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/back","root","yourpassword");
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1,s1.id);
            st.setString(2,s1.stu_name);
            int count=st.executeUpdate();
            System.out.println(count+" row affected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


class Stu {
    int id;
    String stu_name;
}

