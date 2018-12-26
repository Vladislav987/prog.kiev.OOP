package Lesson8.task1;

public class BinarySearchTestDrive {
    public static void main(String[] args) {
        int[] k = {5, 10, 20, 20, 30, 50, 60, 80, 100};
        BinarySearch l = new BinarySearch();
        System.out.println("Index is - " + l.binarySearch(k, 50));
    }
}

//50 -> Index is - 5
//10 -> Index is - 1
//70 -> Index is - 8
