package Lesson8.task2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class CleanerForAll {
    static <T> void remove(Collection<T> collection, Predicate<T> predicate) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
