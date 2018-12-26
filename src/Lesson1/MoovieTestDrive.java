package Lesson1;

public class MoovieTestDrive {
    public static void main(String[] args) {
        Moovie one = new Moovie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.raiting = -2;
        one.playIt();

        Moovie two = new Moovie();
        two.title = "Titanic";
        two.genre = "Drama";
        two.raiting = 5;
        two.playIt();
    }
}
