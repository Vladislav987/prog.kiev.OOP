package Lesson4.Task2;

//Task1 2 (Messenger)
//Написать ядро мессенджера с различными форматами текстового контента.
//Сообщение (Message) содержит автора, дату публикации и текстовый контент.
//Диалог (Dialog) содержит множество сообщений и предоставляет возможность печати всех сообщений в консоль.
//Текстовый контент (Text) может быть нескольких видов: . . . . .. . ..

import java.util.ArrayList;
import java.util.List;

public class Dialog {
    private final List<Message> messages = new ArrayList<>();

    public void addMesseg(Message yourMessage) {
        messages.add(yourMessage);
    }

    public void printDialog() {
        for (Message elem : messages) {
            System.out.println(elem);
        }
    }
}
