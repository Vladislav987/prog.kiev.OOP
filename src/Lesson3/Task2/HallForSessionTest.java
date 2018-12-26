package Lesson3.Task2;

public class HallForSessionTest {
    public static void main(String[] args) {
        HallForSession h1 = new HallForSession("Ascold", 10, 10);

        h1.Reserved(3, 5);
        System.out.println(h1);
        System.out.println(h1.SumSellTickets());
    }

}
