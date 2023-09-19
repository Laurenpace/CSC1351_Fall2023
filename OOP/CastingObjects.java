package CSC1351_Fall2023.OOP;

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
       Parent p1 = new Child("a","b"); //implicit upcasting, instance of
        ((Child) p1).printChild(); //downcasting to call method

    }
}
