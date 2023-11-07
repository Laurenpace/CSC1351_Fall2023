package CSC1351_Fall2023.Collections;

public class Task implements Comparable<Task>{

    private String description;
    private int priority;

    public Task(String Description, int Priority) {
        this.description = Description;
        this.priority = Priority;
    }

    @Override
    public int compareTo(Task Other)
    { return Integer.compare(priority, Other.priority); }

    @Override
    public String toString()
    { return "Task is: " + description + ", Priority is: " + priority; }
}

