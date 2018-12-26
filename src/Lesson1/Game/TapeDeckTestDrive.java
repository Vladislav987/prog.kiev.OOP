package Lesson1.Game;

//import Player.TapeDeck;

public class TapeDeckTestDrive {
    public static void main(String[] args) {

        Player.TapeDeck t = new Player.TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }


}