package CSC1351_Fall2023.OOP.Exercising;

abstract class exercise{
    private String name;
    private int caloriesBurnt;
    private String muscleGroup;

    public exercise(String name, int caloriesBurnt, String muscleGroup) {
        this.name = name;
        this.caloriesBurnt = caloriesBurnt;
        this.muscleGroup = muscleGroup;
    }

    public abstract void print();

}

class Swimming extends exercise{
    private int distance;
    private String stroke;

    public Swimming(String name, int caloriesBurnt, String muscleGroup, int distance, String stroke) {
        super(name, caloriesBurnt, muscleGroup);
        this.distance = distance;
        this.stroke = stroke;
    }

    @Override
    public void print() {
        System.out.println("swimming");
    }
}
public class ExerciseExample {
    public static void main(String[] args) {
        Swimming s = new Swimming("MySwim", 100, "arms", 100, "freestyle");
        s.print();
    }
}
