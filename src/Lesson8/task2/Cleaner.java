package Lesson8.task2;

//Реализовать метод удаления из коллекции всех null элементов.
//	static void removeNulls(Collection<?> collection) { … }
//
//Реализовать обобщенную версию метода, который удаляет из коллекции все элементы, соответствующие предикату.
//static <T> void remove(Collection<T> collection,
//   Predicate<T> predicate) { … }

import java.util.*;

public class Cleaner {
    static  void cleanNull(Collection<?> collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == null){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> name = new ArrayList<>(Arrays.asList(20, 4, 3, 8, 4, 12, 52));
        CleanerForAll.remove(name, new IntegerPredicate());
        System.out.println(name);
    }
}
//[20, 8, 12, 52]