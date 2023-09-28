package CSC1351_Fall2023.OOP;

import java.util.ArrayList;

class Something{
    private String name;

    public Something(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class somethingElse extends Something{
    private double num;

    public somethingElse(String name, double num) {
        super(name);
        this.num = num;
    }

    public double getNum() {
        return num;
    }
}
public class classExample9_28 {
    public static void main(String[] args) {
        ArrayList<Something> sList = new ArrayList<>();
        sList.add(new Something("Reee"));
        sList.add(new Something("lllll"));
        sList.add(new Something("sssss"));
        sList.add(new somethingElse("coffee", 2.3));

        String[] str = ("size item name").split(" ", 2);
        System.out.println(str[0]);
        System.out.println(str[1]);
        double total = 0;

        for (Something s: sList) {

            System.out.println(s.getName());
        }
        for (int i = 0; i < sList.size(); i++) {
            if(sList.get(i).getName().equals("coffee")){
                total += ((somethingElse) sList.get(i)).getNum();
            }

        }



    }
}
