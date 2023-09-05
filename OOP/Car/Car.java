package CSC1351_Fall2023.OOP.Car;

public class Car implements Comparable<Car>
{
    private String make;
    private int year;
    private int price;

    public Car(String Make, int Year, int Price)
    {
        make = Make;
        year = Year;
        price = Price;
    }


    public void printInfo()
    {System.out.println(make +" "+ year +" "+ price ); }

    public int compareTo(Car other)
    {
//        return Integer.compare(price, other.price); //sort by price
        return make.compareTo(other.make);}



}
