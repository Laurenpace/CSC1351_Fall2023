package CSC1351_Fall2023.OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private int IDNum;

    public Student(String name, int IDNum) {
        this.name = name;
        this.IDNum = IDNum;
    }

    public String getName() {
        return name;
    }

    public int getIDNum() {
        return IDNum;
    }
}
public class ArrayListExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //format for an arraylist is
//        ArrayList<Object> variableName = new ArrayList<>();
        //this can be any object you have either written or exists in the java librari
        //Integer for int
        //Double for double

        ArrayList<String> stringArrayList= new ArrayList<>();
        //add an element
        stringArrayList.add("a string");
        stringArrayList.add(in.nextLine());

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.print(stringArrayList.get(i) + " ");
        }
        System.out.println("\n////////////////////////////////");


        //Array of an object you have created
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("lauren", 8922));
        studentArrayList.add(new Student("NAME", 890000));
        System.out.println(studentArrayList.get(0).getName());

        System.out.println("\n/////for loop output////");

        //print student names for loop
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i).getName());
        }

        System.out.println("\n/////foreach output////");
        //same code but for each loop
        for (Student s : studentArrayList) {
            System.out.println(s.getName());
        }
    }


}
