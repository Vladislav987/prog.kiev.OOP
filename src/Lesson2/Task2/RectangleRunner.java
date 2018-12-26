package Lesson2.Task2;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangles small = new Rectangles("Small");
        small.addRactengle(new Rectangle("a", 10.0, 15.0));
        small.addRactengle(new Rectangle("b", 20.0, 10.0));
        small.addRactengle(new Rectangle("c", 32.6, 9.9));

        Rectangles big = new Rectangles("Big");
        big.addRactengle(new Rectangle("F", 119.8, 204.8));
        big.addRactengle(new Rectangle("D", 304.0, 111.1));
        big.addRactengle(new Rectangle("R", 221.5, 187.9));
        big.addRactengle(new Rectangle("G", 1000.0, 56.9));

        System.out.println(small.toString());
        System.out.println();
        System.out.println(big.toString());
    }
}

//Rectangles group: Small
//[ name - a
// weight - 10.0
// height - 15.0
//,  name - b
// weight - 20.0
// height - 10.0
//,  name - c
// weight - 32.6
// height - 9.9
//]
// Sum of Rectangles`s perimetr is 195.0
// Sum of Rectanglese`s area is 672.74
//
//Rectangles group: Big
//[ name - F
// weight - 119.8
// height - 204.8
//,  name - D
// weight - 304.0
// height - 111.1
//,  name - R
// weight - 221.5
// height - 187.9
//,  name - G
// weight - 1000.0
// height - 56.9
//]
// Sum of Rectangles`s perimetr is 4412.0
// Sum of Rectanglese`s area is 156829.29