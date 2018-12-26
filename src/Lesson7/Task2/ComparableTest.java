package Lesson7.Task2;

public class ComparableTest {
    public static void main(String[] args) {


        ComparablePair<Integer> a = new ComparablePair<>(7, 5);
        ComparablePair<String> b = new ComparablePair<>("Kiev", "Odessa");
        System.out.println("Bigger is - " + a.bigger());
        System.out.println("Bigger is - " + b.bigger());
        System.out.println("Smaller is - " + a.smaller());
        System.out.println("Smaller is - " + b.smaller());
    }
}

//Bigger is - 7
//Bigger is - Odessa
//Smaller is - 5
//Smaller is - Kiev