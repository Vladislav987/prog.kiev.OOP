package Lesson1.Game;

public class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число - " + number);
    }

    public static class TapeDeck {
        boolean canRecord = false;

        void playTape(){
            System.out.println("Плёнка проигрывается");
        }

        void recordTape(){
            System.out.println("Плёнка записывается");
        }
    }
}
