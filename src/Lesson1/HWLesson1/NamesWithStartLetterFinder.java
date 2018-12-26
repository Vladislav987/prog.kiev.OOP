package Lesson1.HWLesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        namesWithStartLetter(name, 'A');
    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        ArrayList<String> newName = new ArrayList<>();
        for (String element : names) {
            if (element.charAt(0) == startLetter) {
                newName.add(element);
            }
        }
        System.out.println(Arrays.toString(newName.toArray()));
        return newName;
    }
}

// char A; --> [Anny, Aaron]
