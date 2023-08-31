package CSC1351_Fall2023.OOP.ShapeExample;

public class Driver {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        Triangle t = new Triangle(4, 5);
        r.printArea();
        t.printArea();
        Shape s = new Shape();
        s.printArea();
    }
}
