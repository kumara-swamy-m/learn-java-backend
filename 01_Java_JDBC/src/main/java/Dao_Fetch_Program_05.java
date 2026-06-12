import java.sql.*;

//Main CLass
public class Dao_Fetch_Program_05 {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
         Student s1 =dao.getStudent(4);
         System.out.println(s1.stu_name);

    }
}



//DAO CLASS

class StudentDao {
    public Student getStudent(int id) {

        try{
            Student s= new Student();
            String query = "Select stu_name from student where id="+id;
            s.id=id;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/back","root","yourpassword");
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(query);
            rs.next();
            String stu_name=rs.getString(1);
            s.stu_name=stu_name;
            return s;

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;

    }

}
//Student class

class Student {
     int id;
     String stu_name;
}
