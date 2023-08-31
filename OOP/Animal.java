package CSC1351_Fall2023.OOP;

public class Animal {
    protected String name;
    private String color;

    public void eat(){
        System.out.println("munch");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
