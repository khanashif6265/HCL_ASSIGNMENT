package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Question2 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String username = "root";
    private static final String password = "ashif@0786";

    public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            // Create Table Query
            String createTable = "CREATE TABLE IF NOT EXISTS Students ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(100), "
                    + "branch VARCHAR(50), "
                    + "percentage DOUBLE)";

            stmt.executeUpdate(createTable);
            System.out.println("Table Created Successfully");

            // Insert Records
            String insertData = "INSERT INTO Students (name, branch, percentage) VALUES "
                    + "('Ashif Khan', 'CSE', 75.5),"
                    + "('Rahul Sharma', 'ME', 68.0),"
                    + "('Neha Singh', 'ECE', 82.3)";

            int rows = stmt.executeUpdate(insertData);
            System.out.println(rows + " Records Inserted Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Error Occurred");
            System.out.println(e.getMessage());
        }

    }
}
