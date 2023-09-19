package CSC1351_Fall2023.OOP;

class ParentClass{
    protected int a;
    private int b;
    public int c;
}
class ChildClass extends ParentClass{
    public void print(){
        System.out.println(a);
//        System.out.println(b);//cant access
        System.out.println(c);
    }
}
public class ProtectedVariables {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println(child.a);
        System.out.println(child.c);
//        System.out.println(child.b); //cant access
    }
}
