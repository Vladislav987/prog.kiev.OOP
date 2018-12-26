package Lesson7.Task1;

//Написать утилитный класс Max с единственным статическим методом max(...), находящим максимальный элемент
// в списке по заданному компаратору.
//static <T> T max(List<T> list, Comparator<T> comparator) { … }
//
//(Примечание: в задаче используется static метод для реализации математической функции).

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;

    }
}
