package CSC1351_Fall2023.OOP.AbstractClasses;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void speak(){}

}
