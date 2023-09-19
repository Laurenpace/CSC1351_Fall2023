package CSC1351_Fall2023.OOP;
class parent{
}
class child extends parent{
}
public class instanceOfExample {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        if(c instanceof parent){
            System.out.println("c instance of parent");
        }
        if(c instanceof child){
            System.out.println("c instance of child");
        }
    }
}