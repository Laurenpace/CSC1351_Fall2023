package CSC1351_Fall2023.OOP;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Students student1 = new Students("Lauren");
        System.out.println(student1.getName());

        student1.setName("Lauren Pace");
        System.out.println(student1.getName());

        //manual way of creating an array of objects and assigned the elements.
        Students[] studentArray = new Students[5];

        studentArray[0] = student1;
        studentArray[1] = new Students("keith");

    }
}
