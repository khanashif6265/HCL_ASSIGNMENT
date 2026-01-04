package MiniProject3;
import java.util.Scanner;
public class LoginService {
    private final String USERNAME = "admin";
    private final String PASSWORD = "admin123";


    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String user = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login Successful\n");
            return true;
        } else {
            System.out.println(" Invalid Username or Password");
            return false;
        }
    }
}
