package Lesson8.task2;

import java.util.function.Predicate;

public class IntegerPredicate implements Predicate<Integer> {

    public boolean test(Integer o) {
        return o < 5;
    }
}
