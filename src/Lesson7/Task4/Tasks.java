package Lesson7.Task4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    List<Task> tasks = new ArrayList<>();

    public void addTasks(Task task) {
        tasks.add(task);
    }

    public void sort(Comparator<Task> comparator) {
        tasks.sort(comparator);
    }

    public Tasks filter(Predicate<Task> predicate) {
        Tasks t = new Tasks();
        for (Task elem : tasks) {
            if (predicate.test(elem)) {
                t.addTasks(elem);
            }
        }
        return t;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
