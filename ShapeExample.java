package CSC1351_Fall2023;

abstract class Shape{
//    private double side;
    private boolean isFilled;

    private String color;

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    public abstract void getArea();
    public abstract void getPerimeter();
}

class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(boolean isFilled, String color, double length, double width) {
        super(isFilled, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println(length*width);
    }

    @Override
    public void getPerimeter() {
        System.out.println(2*length + 2*width);
    }
}

class Circle extends Shape{
    private int radius;

    public Circle(boolean isFilled, String color, int radius) {
        super(isFilled, color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
    //  MATH
    }

    @Override
    public void getPerimeter() {
        //  MATH

    }
}
public class ShapeExample {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(true, "blue", 2,6);
        r.getPerimeter();
        Circle c = new Circle(false, null, 3);
        c.getPerimeter();
    }
}
