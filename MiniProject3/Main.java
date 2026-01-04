package MiniProject3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
          LoginService login = new LoginService();
        if (!login.login()) return;

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Student Management Menu -----");

                 System.out.println("1. Add Student");

            System.out.println("2. Display All Students");

               System.out.println("3. Search Student by Eno");

            System.out.println("4. Update Student Branch");

            System.out.println("5. Delete Student by Eno");

            System.out.println("6. Display Sorted Students");

            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> service.addStudent();

                   case 2 -> service.displayAll();

                case 3 -> service.searchByEno();

                    case 4 -> service.updateBranch();

                case 5 -> service.deleteStudent();

                case 6 -> service.sortStudents();
                case 7 -> {
                    System.out.println(" Exiting... Thank You!");
                    System.exit(0);
                }
                default -> System.out.println(" Invalid Choice");
            }
        }
    }
}
