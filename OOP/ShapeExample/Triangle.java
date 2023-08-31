package CSC1351_Fall2023.OOP.ShapeExample;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void printArea(){
        System.out.println((sideA * sideB)/2);
    }
}
