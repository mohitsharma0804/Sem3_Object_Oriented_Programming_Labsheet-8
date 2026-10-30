import java.io.Serializable;

public class StudentBean implements Serializable {
    private int id;
    private String name;
    private double grade;

    public StudentBean() {}

    public StudentBean(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.setId(101);
        student.setName("Alice");
        student.setGrade(3.9);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Grade: " + student.getGrade());
    }
}
