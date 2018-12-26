package Lesson7.Task1;

import java.util.Comparator;
import java.util.List;

public class Max {
    static <T> T max(List<T> list, Comparator<T> comparator) {
        T max = list.get(0);
        for (T elem : list) {
            if (comparator.compare(elem, max) > 0) {
                max = elem;
            }
        }
        return max;

        //   or
        // return list.stream().max(comparator).get();
    }

}
