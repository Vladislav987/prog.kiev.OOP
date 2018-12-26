package Lesson1.ArrayListTask;

import java.util.ArrayList;

public class ArrayListMy {
    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<>();

        book.add("Troya");
        book.add("Meteor");
        book.add("Vizantia");
        book.add("Java");

        System.out.println(book.size());

        book.add(1, "Java");
        System.out.println(book.size());

        System.out.println(book.get(1));
        System.out.println(book.get(book.size() - 1));
        System.out.println();

        System.out.println(book.indexOf("Meteor"));
        System.out.println(book.contains("Java"));

        book.set(4, "Kiev");

        System.out.println();

        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));

        }
        System.out.println();
        book.remove("Odessa");
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));

        }
        System.out.println("222");
        book.clear();
        System.out.println("111");

    }


}