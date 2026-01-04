package MiniProject3;

public class Student implements Comparable<Student> {
    private int eno;
    private String name;
    private String branch;
    private int sem;
    private double percentage;

    public Student(int eno, String name, String branch, int sem, double percentage) {
        this.eno = eno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
        this.percentage = percentage;
    }

    public int getEno() {
        return eno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(this.percentage, s.percentage);
    }

    @Override
    public String toString() {
        return "Eno: " + eno +
                ", Name: " + name +
                ", Branch: " + branch +
                ", Sem: " + sem +
                ", Percentage: " + percentage;
    }
}