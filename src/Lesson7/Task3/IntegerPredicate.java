package Lesson7.Task3;

import java.util.function.Predicate;

public class IntegerPredicate implements Predicate<Integer> {
    private final int first;
    private final int second;

    public IntegerPredicate(int first, int second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public boolean test(Integer integer) {
        return integer >= first && integer <= second;
    }
}
