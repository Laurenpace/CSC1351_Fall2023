package CSC1351_Fall2023.OOP;

import java.util.ArrayList;

class Department{
    private String name;
    private ArrayList<Faculty> facultyMembers;

    public void addFaculty(Faculty f){
        facultyMembers.add(f);
    }
}

class Faculty{
    private String name;
    private String title;
    private String salary;

    private Department departmentName;
    public Faculty(String name, String title){
        this.name = name;
        this.title = title;
    }
    public void setDepartment(Department d){
        departmentName = d;
    }
}

class University{
    private String name;
    private ArrayList<Department> departments;

    public University(String name, Department department){
        this.name = name;
        departments.add(department);
    }

    public void addDepartment(Department department){
        departments.add(department);
    }
}
public class AggregationCompositionExample {
    public static void main(String[] args) {

    }
}
