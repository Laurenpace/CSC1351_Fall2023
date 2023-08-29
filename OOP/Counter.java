package CSC1351_Fall2023.OOP;

public class Counter {
    private int value;

    public void Count(){
        value++;
    }

    public int Display(){
        return value;
    }

    public static void main(String[] args) {
        Counter ctr = new Counter();
        Counter ctr1 = new Counter();
        for (int i = 0; i < 1000; i++) {
            ctr.Count();
            ctr1.Count();
            System.out.println(ctr.Display());
        }
    }
}