package Lesson2.Task2;

//Написать классы:
//1) Rectangle (прямоугольник).
//Свойства: ширина, высота.
//Методы: подсчет периметра, подсчет площади.
//2) Rectangles (прямоугольники).
//Свойства: список прямоугольников.
//Методы: добавление прямоугольника, подсчет суммарной площади всех прямоугольников.
//3) Клиентский класс RectangleRunner: протестировать функционал предыдущих классов.

public class Rectangle {
    private final String name;
    private final double weight;
    private final double height;

    public Rectangle(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return " name - " + name + "\n weight - " + weight + "\n height - " + height + "\n";
    }

    public double areaRectangle() {
        return weight * height;
    }

    public double perimetrRactangle() {
        return (weight + height) * 2;

    }
}
