package Lesson7.Task4;

import java.util.Comparator;

public class TaskComparators {

    public static Comparator<Task> byID() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getId() - o2.getId();
            }
        };
    }

    public static Comparator<Task> byName() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                int i;

 /*               int b = o1.getName().length() > o2.getName().length() ? o2.getName().length() : o1.getName().length();
                if (o2.getName().length() < o1.getName().length()) {

                }
                    for (i = 0; i < b - 1; i++) {
                        if (!(o1.getName().charAt(i) == o2.getName().charAt(i))) {
                            break;
                        }else {
                        return o1.getName().length() - o2.getName().length();
                        }
                    }
                return  o1.getName().charAt(i) - o2.getName().charAt(i) ;*/  return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public static Comparator<Task> byDeadLine() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        };
    }

    public static Comparator<Task> byPriority() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.getPriority().compareTo(o2.getPriority());
            }
        };
    }

}
