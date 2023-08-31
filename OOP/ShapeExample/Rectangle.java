package CSC1351_Fall2023.OOP.ShapeExample;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void printArea(){
        System.out.println(sideA * sideB);
    }
}
