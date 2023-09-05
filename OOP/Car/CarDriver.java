package CSC1351_Fall2023.OOP.Car;

import CSC1351_Fall2023.OOP.ShapeExample.Rectangle;

import java.util.ArrayList;
import java.util.Collections;

public class CarDriver {
    public static void main(String[] args)
    {

        ArrayList<Car> myCars = new ArrayList<>();

        myCars.add(new Car("Honda", 2009, 10000));
        myCars.add(new Car("Kia", 2007, 4000));
        myCars.add(new Car("Toyota", 1999, 1800));
        myCars.add(new Car("Honda", 2009, 5));
        myCars.add(new Car("Honda", 1999, 2));


        Collections.sort(myCars);

        for(Car c: myCars)
            c.printInfo();

    }

}

