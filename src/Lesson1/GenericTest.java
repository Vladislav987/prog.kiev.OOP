package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String > list = new ArrayList<>();

        rawList = list;
        rawList.add(8);

        String s = list.get(0);
    }
}
