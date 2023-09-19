package CSC1351_Fall2023.OOP;

interface printable{
    void print();
}
class classThatPrints implements printable {

    public void print(){
        System.out.println("Forced print method");
    }
}
public class printInterfaceExample {
}
