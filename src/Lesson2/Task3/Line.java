package Lesson2.Task3;

//Написать классы:
// 1) Point (точка).
//Свойства: x, y.
// 2) Line (линия).
//Свойства: начальная точка, конечная точка.
//Методы: подсчет длины линии.
// 3) Lines (линии).
//Свойства: список линий.
//Методы: добавление линии, суммарная длина всех линий, нахождение самой длинной линии.
// 4) Клиентский класс LineRunner: протестировать функционал предыдущих классов.

public class Line {
    private final String name;
    private final Point firstPoint;
    private final Point lastPoint;

    public Line(String name, Point firstPoint, Point lastPoint) {
        this.name = name;
        this.firstPoint = firstPoint;
        this.lastPoint = lastPoint;
    }

    public String getName() {
        return name;
    }


    public double lenghtLine() {
        return Math.sqrt(Math.pow(lastPoint.getX() - firstPoint.getX(), 2) + Math.pow(lastPoint.getY() - firstPoint.getY(), 2));
    }

    public String toString() {
        return "Line - " + name + "; firs point (" + firstPoint + "); last point (" + lastPoint + ") \n Length " + lenghtLine() + "\n";
    }


}
