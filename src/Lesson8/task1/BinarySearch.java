package Lesson8.task1;

//Реализовать бинарный поиск (см. Википедия: бинарный поиск). Входные параметры: заранее отсортированный массив array, элемент для поиска elem. Результат:
//Если elem присутствует в array, вернуть индекс elem.
//Если elem отсутствует в array, вернуть -(pos + 1), где pos - индекс elem, если бы elem находился в  array.

public class BinarySearch {

    static int binarySearch(int[] index, int elem) {
        if (index.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int lefth = 0;
        int right = index.length;
        int mid = 0;
        do {
            mid = lefth + (right - lefth) / 2;
            if (index[mid] == elem) {
                return mid;
            }
            if (index[mid] > elem) {
                right = mid;
            } else {
                lefth = mid + 1;
            }
        } while (!(lefth == right));
        return -(lefth + 1);
    }
}
