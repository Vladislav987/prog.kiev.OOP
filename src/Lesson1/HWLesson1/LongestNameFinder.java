package Lesson1.HWLesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));
        longestName(name);
    }

    private static String longestName(ArrayList<String> names) {
        if (names.isEmpty()){
            throw new IllegalArgumentException("Your list is Empty!");
        }
        String LongName = "";
        for (String element: names) {
            if (LongName.length() < element.length())
                LongName = element;
        }
        System.out.println(LongName);
        return LongName;
    }
}

//=> Richard