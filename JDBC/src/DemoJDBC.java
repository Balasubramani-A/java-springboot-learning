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
        String sql = "select * from student";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        // rs.next();

        // String name = rs.getString("sname");
        // System.out.println("Name of a student is " + name);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getString(3));
        }
        // System.out.println(rs.next());
        con.close();
        System.out.println("Connection closed");




    }


}
