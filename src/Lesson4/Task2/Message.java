package Lesson4.Task2;

import java.time.LocalDateTime;

public class Message {
    private final String author;
    private final LocalDateTime datePublic;
    private final Text content;

    public Message(String author, LocalDateTime datePublic, Text content) {
        this.author = author;
        this.datePublic = datePublic;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getDatePublic() {
        return datePublic;
    }

    public Text getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message " +
                "Author = " + author +
                ", datePublic = " + datePublic +
                ", content = \n" + content.getText() + '\n';
    }
}
