package MiniProject3;
import java.util.*;
public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Add Student
    public void addStudent() {
        try {
            System.out.print("Enter Eno: ");
            int eno = sc.nextInt();
            sc.nextLine();

            for (Student s : students) {
                if (s.getEno() == eno)
                    throw new Exception("Eno already exists!");
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();
            if (branch.isEmpty())
                throw new Exception("Branch cannot be empty");

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            System.out.print("Enter Percentage: ");
            double per = sc.nextDouble();
            if (per <= 0)
                throw new Exception("Percentage must be positive");

            students.add(new Student(eno, name, branch, sem, per));

            System.out.println(" Student Added Successfully");

        } catch (Exception e) {

            System.out.println(" Error: " + e.getMessage());
            sc.nextLine();
        }
    }

    // Display All
    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println(" No students found");
            return;
        }
        students.forEach(System.out::println);
    }

    // Search
    public void searchByEno() {
        System.out.print("Enter Eno to Search: ");
        int eno = sc.nextInt();

        for (Student s : students) {
            if (s.getEno() == eno) {
                System.out.println(s);
                return;
            }
        }
        System.out.println(" Student not found");
    }

    // Update Branch
    public void updateBranch() {
        System.out.print("Enter Eno: ");
        int eno = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getEno() == eno) {
                System.out.print("Enter New Branch: ");
                String branch = sc.nextLine();
                if (branch.isEmpty()) {
                    System.out.println(" Branch cannot be empty");
                    return;
                }
                s.setBranch(branch);
                System.out.println(" Branch Updated");
                return;
            }
        }
        System.out.println(" Student not found");
    }

    // Delete
    public void deleteStudent() {
        System.out.print("Enter Eno to Delete: ");
        int eno = sc.nextInt();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getEno() == eno) {
                it.remove();
                System.out.println(" Student Deleted");
                return;
            }
        }
        System.out.println(" Student not found");
    }

    // Sort
    public void sortStudents() {
        Collections.sort(students);
        System.out.println(" Students Sorted by Percentage");
        displayAll();

}
}
