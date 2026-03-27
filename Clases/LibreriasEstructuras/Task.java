package Clases.LibreriasEstructuras;

public class Task implements Comparable<Task>{
    private int priority;
    private String name;

    public Task(String name, int priority){
        this.priority = priority;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task otra) {
        return Integer.compare(this.priority, priority);
    }

    @Override
    public String toString() {
        return "Task: name: " + name + ", priority: " + priority;
    }
    
}
