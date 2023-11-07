package CSC1351_Fall2023.Collections;

import java.util.PriorityQueue;

public class PriorityQueueObjects {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQ = new PriorityQueue<>();
        taskQ.add(new Task("Do laundry", 3));
        taskQ.add(new Task("Attend Class", 1));
        taskQ.add(new Task("Grade Homework", 2));
        taskQ.add(new Task("Get coffee", 4));
        taskQ.add(new Task("Work out", 5));

        while(!taskQ.isEmpty()){
            System.out.println(taskQ.poll());
        }


    }
}
