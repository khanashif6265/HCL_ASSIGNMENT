//3	Write a program to increase 5% to percentage of all Students whose branch is CSE.

package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Question3 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc2";
    private static final String username = "root";
    private static final String password = "ashif@0786";

    public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Update Query (Increase 5% for CSE students)
            String updateQuery =
                    "UPDATE Students " +
                            "SET percentage = percentage + (percentage * 0.05) " +
                            "WHERE branch = 'CSE'";

            int rows = stmt.executeUpdate(updateQuery);

            System.out.println(rows + " Students percentage updated successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Error occurred");
            System.out.println(e.getMessage());
        }
    }
}
