package Lesson7.Task3;

//Написать утилитный класс Filter с единственным статическим методом filter(...),
// который выбирает из списка все элементы, удовлетворяющие предикату.

import java.time.LocalDate;
import java.util.function.Predicate;

public class DateAfterPredicate implements Predicate<LocalDate> {
    private final LocalDate date;

    public DateAfterPredicate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean test(LocalDate localDate) {
        return localDate.isAfter(date);
    }
}
