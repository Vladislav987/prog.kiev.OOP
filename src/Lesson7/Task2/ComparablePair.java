package Lesson7.Task2;

//Задание:
//Написать класс ComparablePair<T>, хранящий 2 объекта, умеющих сравниваться друг с другом.
// В классе присутствуют 2 метода - T bigger(), T smaller(), - находящие больший и меньший объект из 2-ух в паре.
// Если объекты одинаковые, то возвращать первый.

public class ComparablePair<T extends Comparable<? super T>> {
    private final T firs;
    private final T second;

    public ComparablePair(T firs, T second) {
        this.firs = firs;
        this.second = second;
    }

    public T bigger() {
        return (firs.compareTo(second) >= 0) ? firs : second;

    }

    public T smaller() {
        return (firs.compareTo(second) < 0) ? firs : second;

    }
}
