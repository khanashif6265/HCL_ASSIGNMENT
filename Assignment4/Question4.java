//4	Write a program to delete of all Students whose records whose year of passing is 2024. and branch is Civil.
package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Question4 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc3";
    private static final String username = "root";
    private static final String password = "ashif@0786";

    public static void main(String[] args) {

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Delete Query
            String deleteQuery =
                    "DELETE FROM Students " +
                            "WHERE year_of_passing = 2024 AND branch = 'Civil'";

            int rows = stmt.executeUpdate(deleteQuery);

            System.out.println(rows + " Students records deleted successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Error occurred");
            System.out.println(e.getMessage());
        }
    }
}