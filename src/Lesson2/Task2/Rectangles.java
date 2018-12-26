package Lesson2.Task2;

import java.util.ArrayList;

public class Rectangles {
    private final String groupName;
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public Rectangles(String groupName) {
        this.groupName = groupName;
    }

    public void addRactengle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double sumOfAreaAllRectengle() {
        double sumOfArea = 0;
        for (Rectangle elem : rectangles) {
            sumOfArea += elem.areaRectangle();
        }
        return sumOfArea;
    }

    public double sumOfPerimetr() {
        double sumOfPerim = 0;
        for (Rectangle elem : rectangles) {
            sumOfPerim += elem.perimetrRactangle();
        }
        return sumOfPerim;
    }

    public String getName() {
        return groupName;
    }

    public String toString() {
        return "Rectangles group: " + groupName + "\n" + rectangles + "\n Sum of Rectangles`s perimetr is " + sumOfPerimetr() + "\n Sum of Rectanglese`s area is " + sumOfAreaAllRectengle();
    }

}
