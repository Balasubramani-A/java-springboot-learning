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

        Connection con = DriverManager.getConnection(url, uname, pass);

        System.out.println("Connection established");
        System.out.println("This works out of the box!");
    }


}
