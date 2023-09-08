package CSC1351_Fall2023.OOP.LSU;

import java.util.ArrayList;

class User{
    private String name;
    private String email;
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    //no setter so email is immutable
//    public void setEmail(String email) {
//        this.email = email;
//    }
}

class AcademicUser extends User{
    private int ID_89_Num;
    private ArrayList<Course> courses = new ArrayList<>();
    //courses

    public AcademicUser(String name, String email, int ID_89_Num ){
        super(name, email);
        this.ID_89_Num = ID_89_Num;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public int getID_89_Num() {
        return ID_89_Num;
    }


}

class Student extends AcademicUser{
    private double GPA;
    private String major;

    public Student(String name, String email, int ID_89_Num, String major){
        super(name, email, ID_89_Num);
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
class Instructor extends AcademicUser{
    private double Salary;

    public Instructor(String name, String email, int ID_89_Num) {
        super(name, email, ID_89_Num);
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}

class Course{
    private String courseName;
    private Instructor instructor;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student){
        students.add(student);
        student.addCourse(this);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void printStudents() {
        for(Student s: students)
            System.out.println(s.getName());
    }
}


public class LSUSystem {
    public static void main(String[] args) {
        Course csc1351 = new Course("CSC 1351");
        Student student1 = new Student("Kevin", "klaw1@lsu.edu", 89999999, "Computer Science");
        csc1351.addStudent(student1);
        Instructor instructor1351 = new Instructor("Dr. Tim", "timmyboi@lsu.edu", 891222);
        csc1351.setInstructor(instructor1351);

        Student student2 = new Student("Keith", "keith@lsu.edu", 890002, "Computer Engineering");
        csc1351.addStudent(student2);

        csc1351.printStudents();


    }
}
