package Lesson2.Task1;

//1)Написать классы:
//Dish (блюдо).
//Свойства: название, описание, цена.
//2)Menu (меню).
//Свойства: название, список блюд.
//Методы: добавление блюда, нахождение самого дешевого блюда.
//3)Клиентский класс MenuRunner: создать 2 меню, каждое заполнить 3-я блюдами, протестировать
// функционал нахождения самого дешевого блюда.

//Дополнить класс Menu из задачи 1 лекции 2 таким образом,
// чтобы была возможность пройтись в for-each по всем блюдам из меню.

public class Dish {
    private final String name;
    private final String description;
    private final long price;

    public Dish(String name, String description, long price) {

        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return "Dish name - " + name + '\n' + " descripshion - " + description + '\n' + " prise - " + price + '\n';


    }
}
