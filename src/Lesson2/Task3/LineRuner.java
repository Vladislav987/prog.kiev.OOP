package Lesson2.Task3;

public class LineRuner {
    public static void main(String[] args) {

        Lines lines = new Lines();
        lines.addLine(new Line("A", new  Point(6,4), new Point(2,4)));
        lines.addLine(new Line("B", new Point(4, 5), new Point(7,3)));
        lines.addLine(new Line("C",new Point(5.3, 3.7), new Point(6.6, 7.8)));
        lines.addLine(new Line("D",new Point(2.2, 13.7), new Point(1.9, 11.)));
        System.out.println(lines.toString());
        System.out.println(lines.toStringLong());
    }
}

//[Line - A; firs point (x = 6.0, y = 4.0); last point (x = 2.0, y = 4.0)
// Length 4.0
//, Line - B; firs point (x = 4.0, y = 5.0); last point (x = 7.0, y = 3.0)
// Length 3.605551275463989
//, Line - C; firs point (x = 5.3, y = 3.7); last point (x = 6.6, y = 7.8)
// Length 4.301162633521313
//, Line - D; firs point (x = 2.2, y = 13.7); last point (x = 1.9, y = 11.0)
// Length 2.7166155414412243
//]
//Sum of Lines is 14.623329450426528
//Most long line is 4.301162633521313