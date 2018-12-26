package Lesson7.Task1;

import java.util.Arrays;
import java.util.List;

public class MaxRunner {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(5,0,6,9,-2);
        List<String> strings = Arrays.asList("Привет","Yes","No");

        int max = Max.max(integers,  new IntegerComparator());
        System.out.println("Max is - " + max);
        String max1 = Max.max(strings,new StringComparator());
        System.out.println("Max is - " + max1);
    }
}

//Max is - 9
//Max is - Привет
