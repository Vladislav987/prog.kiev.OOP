package Lesson7.Task4;

import java.time.LocalDate;

public class Task {
    private final int id;
    private final String name;
    private final LocalDate deadline;
    private final Priority priority;

    public Task(int id, String name, LocalDate deadline, Priority priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deadline=" + deadline +
                ", priority=" + priority +
                '}';
    }
}
