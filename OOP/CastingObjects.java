package CSC1351_Fall2023.OOP;

import java.util.ArrayList;

class Parent{
    private String a;

    public Parent(String a) {
        this.a = a;
    }

    public void print(){
        System.out.println(a);
    }
}

class Child extends Parent{
    private String b;

    public Child(String a, String b) {
        super(a);
        this.b = b;
    }
    public void printChild(){
        System.out.println(b);
    }
}
public class CastingObjects {
    public static void main(String[] args) {
        Child c = new Child("a","b");
        Parent p = new Parent("a");
       Parent p1 = new Child("a","b"); //implicit upcasting, subclass type to superclass type, instance of

        ArrayList<Parent> list = new ArrayList<>();
        c.printChild();;
        list.add(c); //
//        list.get(0).printChild();
        if(list.get(0) instanceof Parent) { //list.get(0) == c
            ((Child)list.get(0)).printChild();
        }

        ((Child) p1).printChild(); //downcasting to call method

        //further reading
        //https://www.baeldung.com/java-type-casting
    }
}
