package Lesson7.Task4;

import java.time.LocalDate;

public class TestDrive {
    public static void main(String[] args) {
        Task a = new Task(456, "Read", LocalDate.of(2015, 12, 12), Priority.NORMAL);
        Task b = new Task(123, "Writhe", LocalDate.of(2016, 2, 5), Priority.MAJOR);
        Task c = new Task(754, "Reader", LocalDate.of(2019, 6, 19), Priority.MINOR);
        Task d = new Task(755, "Repeat Task1 456", LocalDate.of(2018, 8, 19), Priority.MINOR);

        Tasks x = new Tasks();
        x.addTasks(a);
        x.addTasks(b);
        x.addTasks(c);
        x.addTasks(d);

        System.out.println("List of Tasks " + x.toString());

        x.sort(TaskComparators.byID());
        System.out.println("Tasks sorted by ID " + x.toString());

        x.sort(TaskComparators.byName());
        System.out.println("Tasks sorted by Name " + x.toString());

        x.sort(TaskComparators.byDeadLine());
        System.out.println("Tasks sorted by Deadline " + x.toString());

        System.out.println("--------------------------");
        System.out.println("Tasks filtered by Contains string in name " + x.filter(TaskPredicates.nameContains("R")));
        System.out.println("Tasks filtered by deadline " + x.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println("Tasks filtered by Priority " + x.filter(TaskPredicates.hasPriority(Priority.MINOR)));
    }
}

//List of Tasks Tasks{tasks=[Task1{id=456, name='Read', deadline=2015-12-12, priority=NORMAL}, Task1{id=123, name='Writhe', deadline=2016-02-05, priority=MAJOR}, Task1{id=754, name='Bike', deadline=2019-06-19, priority=MINOR}, Task1{id=755, name='Repeat Task1 456', deadline=2018-08-19, priority=MINOR}]}
//Tasks sorted by ID Tasks{tasks=[Task1{id=123, name='Writhe', deadline=2016-02-05, priority=MAJOR}, Task1{id=456, name='Read', deadline=2015-12-12, priority=NORMAL}, Task1{id=754, name='Bike', deadline=2019-06-19, priority=MINOR}, Task1{id=755, name='Repeat Task1 456', deadline=2018-08-19, priority=MINOR}]}
//Tasks sorted by Name Tasks{tasks=[Task1{id=754, name='Bike', deadline=2019-06-19, priority=MINOR}, Task1{id=456, name='Read', deadline=2015-12-12, priority=NORMAL}, Task1{id=755, name='Repeat Task1 456', deadline=2018-08-19, priority=MINOR}, Task1{id=123, name='Writhe', deadline=2016-02-05, priority=MAJOR}]}
//Tasks sorted by Deadline Tasks{tasks=[Task1{id=456, name='Read', deadline=2015-12-12, priority=NORMAL}, Task1{id=123, name='Writhe', deadline=2016-02-05, priority=MAJOR}, Task1{id=755, name='Repeat Task1 456', deadline=2018-08-19, priority=MINOR}, Task1{id=754, name='Bike', deadline=2019-06-19, priority=MINOR}]}
//--------------------------
//Tasks filtered by Contains string in name Tasks{tasks=[Task1{id=456, name='Read', deadline=2015-12-12, priority=NORMAL}, Task1{id=755, name='Repeat Task1 456', deadline=2018-08-19, priority=MINOR}]}
//Tasks filtered by deadline Tasks{tasks=[Task1{id=456, name='Read', deadline=2015-12-12, priority=NORMAL}, Task1{id=123, name='Writhe', deadline=2016-02-05, priority=MAJOR}]}
//Tasks filtered by Priority Tasks{tasks=[Task1{id=755, name='Repeat Task1 456', deadline=2018-08-19, priority=MINOR}, Task1{id=754, name='Bike', deadline=2019-06-19, priority=MINOR}]}