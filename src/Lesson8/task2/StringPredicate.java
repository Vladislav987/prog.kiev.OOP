package Lesson8.task2;

import java.util.function.Predicate;

public class StringPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s == null;
    }
}
