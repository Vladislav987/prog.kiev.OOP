package Lesson4.Task2;

public class PlainText implements Text {
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
