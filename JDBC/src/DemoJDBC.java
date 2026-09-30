import java.sql.*;

public class DemoJDBC{

    public static void main(String[] args) throws Exception{
        /*
        Steps
        import package
        load and register
        create connection
        create statement
        execute statement
        process the result
        close
         */

        //Optional line
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "root";
//        String sql = "insert into student values(5, 'John', 48)";
//        String sql = "update student set sname = 'Max' where sid = 5";
        // String sql = "delete from student where sid = 5 ";

        String sql = "insert into student values(?, ?, ?)";


        int sid = 102;
        String sname = "Jasmine";
        int marks = 52;

        Connection con = DriverManager.getConnection(url, uname, pass);
        
        System.out.println("Connection established");

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        st.execute();
//        



        con.close();
        System.out.println("Connection closed");




    }


}
