package CSC1351_Fall2023.Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> myPq = new PriorityQueue<>();

        myPq.add("John");
        myPq.add("Seth");
        myPq.add("Sarah");
        myPq.add("Adam");
//        myPq.add("Aaron");

        System.out.println(myPq.peek());  // returns the first in line
        myPq.poll();    // Removes the first in line

        while(!myPq.isEmpty()){
            System.out.println(myPq.poll());
        }

        PriorityQueue<Integer> myPqNum = new PriorityQueue<>();

//       myPqNum.add(48);
//       myPqNum.add(4);
//       myPqNum.add(2);
//       myPqNum.add(1);

        myPqNum.add(5);
        myPqNum.add(4);
        myPqNum.add(2);
        myPqNum.add(1);
//        System.out.println(myPqNum.peek());  // returns the first in line
//        myPqNum.poll();    // Removes the first in line

//        for(int n: myPqNum )
//            System.out.println(n);
        while(!myPqNum.isEmpty()){
            System.out.println(myPqNum.poll());
        }
    }
}
