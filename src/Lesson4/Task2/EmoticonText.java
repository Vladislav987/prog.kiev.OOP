package Lesson4.Task2;

public class EmoticonText implements Text {
    private final String emotion;

    public EmoticonText(String emotion) {
        this.emotion = emotion;
    }

    @Override
    public String getText() {
        String a = null;
        if (emotion.equalsIgnoreCase("winkin-face")) {
            a = "\uD83D\uDE09";
        }
        if (emotion.equalsIgnoreCase("ghost")) {
            a = "\uD83D\uDC7B";
        }

        return a;
    }
}