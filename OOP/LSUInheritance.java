//package CSC1351_Fall2023.OOP;
//
//
//
//import java.util.ArrayList;
//
//class User{
//    private String name;
//    final private String email;
//
//    public static String school = "LSU";
//
//    public User(String name, String email){
//        this.name = name;
//        this.email = email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail(){
//        return email;
//    }
//}
//
//class AcademicUser extends User{
//    private int ID_89_NUMBER;
//    private ArrayList<Course> courses = new ArrayList<>();
//
//    public AcademicUser(String name, String email, int ID_89_NUMBER){
//        super(name, email);
//        this.ID_89_NUMBER = ID_89_NUMBER;
//    }
//    public void addCourse(Course course){
//        courses.add(course);
//    }
//
//    public void printCourses() {
//        for(Course c: courses)
//            System.out.println(c.getCourseName());
//    }
//}
//
//class Student extends AcademicUser{
//    private Double GPA;
//    private String Major;
//
//    public Student(String name, String email, int ID_89_NUMBER){
//        super(name, email, ID_89_NUMBER);
//    }
//
//
//}
//
//class Instructor extends AcademicUser{
//    public Instructor(String name, String email, int ID_89_NUMBER){
//        super(name, email, ID_89_NUMBER);
//    }
//}
//
//class Course{
//    private String courseName;
//
//    private Instructor instructor;
//    private ArrayList<Student> students = new ArrayList<>();
//
//    public Course(String courseName){
//        this.courseName = courseName;
//    }
//
//    public void addStudent(Student student){
//        students.add(student);
//        student.addCourse(this);
//    }
//    public int getNumberOfStudents(){
//        return students.size();
//    }
//
//    public String getCourseName(){
//        return courseName;
//    }
//
//}
//public class LSUInheritance {
//    public static void main(String[] args) {
//        Course course1351 = new Course("CSC 1351");
//        Student kevin = new Student("Kevin Gilbert", "kgil4@lsu.edu", 89111);
////        kevin.addCourse(course1351);
//
//        course1351.addStudent(kevin);
//
//        System.out.println(kevin.school);
//        kevin.printCourses();
//    }
//}
