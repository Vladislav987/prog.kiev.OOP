package Lesson2.Task3;

import java.util.ArrayList;

public class Lines {
    private final ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public double sumLine() {
        double sum = 0;
        for (Line elem : lines) {
            sum += elem.lenghtLine();
        }
        return sum;
    }

    public double longLine() {
        double longest = 0;
        for (Line elem : lines) {
            if (elem.lenghtLine() > longest) {
                longest = elem.lenghtLine();
            }
        }
        return longest;
    }

    public String toString() {
        return lines + "\nSum of Lines is " + sumLine();
    }

    public String toStringLong() {
        return "Most long line is " + longLine();
    }
}