package Lesson8.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(20, 4, null, 3, 8, 4, 12, null, 52));
        Cleaner.cleanNull(integers);
        System.out.println(integers);
        List<String> strings = new ArrayList<>(Arrays.asList("one", null, "two", "three", null, "five"));
        CleanerForAll.remove(strings, new StringPredicate());
        System.out.println(strings);
    }
}

//[20, 4, 3, 8, 4, 12, 52]
//[one, two, three, five]
