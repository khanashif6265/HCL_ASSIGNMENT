package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
public class Question1 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String username = "root";
    private static final String password = "ashif@0786";

    public static void main(String[] args) {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            if (con != null) {
                System.out.println("Connection Successful");
            } else {
                System.out.println("Unable to connect");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Unable to connect");
            System.out.println(e.getMessage());
        }
    }
}
