package CSC1351_Fall2023.Collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Alpha");
        s.push("Beta");
        s.push("Gamma");

        System.out.println(s.peek());

        while (!s.isEmpty())
        {
            System.out.println(s.pop());

        }












//        String str = "a;sentence;of;words";
//        String[] split = str.split(";");
//        for(String word : split){
//            s.push(word);
//        }
//        while (!s.isEmpty())
//        {
//            System.out.println(s.pop());
//        }

    }
}
