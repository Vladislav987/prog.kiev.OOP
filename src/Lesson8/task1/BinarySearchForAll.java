package Lesson8.task1;

//Реализовать обобщенную версию бинарного поиска, не зависящую от типа внутренних элементов списка.
//static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator)

import java.util.Comparator;
import java.util.List;

public class BinarySearchForAll {
    static <T> int binarySearch(List<T> list, T elem, Comparator<T> comparator){
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        int left = 0;
        int rihgt = list.size();
        int mid = 0;
        do {
            mid = left + (rihgt - left) / 2;
            if (comparator.compare(list.get(mid),elem) == 0){
                return mid;
            }if (comparator.compare(list.get(mid), elem) > 0){
                rihgt = mid;
            }else{
                left = mid + 1;
            }
        }while (!(left==rihgt));
        return - (left + 1);
    }
}
