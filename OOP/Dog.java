package CSC1351_Fall2023.OOP;

public class Dog extends Animal {
    private int breed;


    public void eat() {
        System.out.println("nom nom");
        System.out.println(name);
    }

    public int getBreed() {
        return breed;
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
