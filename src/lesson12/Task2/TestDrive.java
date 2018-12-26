package lesson12.Task2;

import Lesson9.task1.Product;

public class TestDrive {
    public static void main(String[] args) {
        Integer a = 5555;
        Integer b = new Cloner().clone(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        Product x = new Product(23568L, "TAta", "dfskfslkdf", 2356L); //Product implements Serializable
        Product x1 = new Cloner().clone(x);
        System.out.println(x1.toString());
        String s = "Hello world!";
        String s1 = new Cloner().clone(s);
        System.out.println(s1);
    }
}
//5555
//false
//true
//Product{id=23568, name='TAta', description='dfskfslkdf', price=2356}
//Hello world!
