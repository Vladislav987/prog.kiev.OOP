package Lesson8.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearchForAllTestDriveAll {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5, 10, 20, 20, 30, 50, 60, 80, 100);
        int x = BinarySearchForAll.binarySearch(integers, 70, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Index is - " + x);
    }
}
//50 -> Index is - 5
//10 -> Index is - 1
//70 -> Index is - 8
