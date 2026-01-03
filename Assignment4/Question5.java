//5	Write a program to display records of all Students whose semester is 7 and branch is EC.

package Assignment4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Question5 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/jdbc4";
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

            // Select Query
            String selectQuery =
                    "SELECT * FROM Students " +
                            "WHERE semester = 7 AND branch = 'EC'";

            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("ID\tName\t\tBranch\tSemester\tPercentage");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getString("branch") + "\t" +
                                rs.getInt("semester") + "\t\t" +
                                rs.getDouble("percentage")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error occurred");
            System.out.println(e.getMessage());
        }
    }
}
