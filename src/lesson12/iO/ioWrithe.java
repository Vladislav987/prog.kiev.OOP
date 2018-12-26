package lesson12.iO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ioWrithe {
    public static void main(String[] args) throws IOException {
      Scanner a = new Scanner(System.in);
        System.out.println("Writhe");
        String s = a.nextLine() +"\t";
        int x = 122;
 //       OutputStream outputStream = new FileOutputStream("C://Users//art//io.txt",true);
        FileWriter fileWriter = new FileWriter("C://Users//art//io.txt");
        byte[] c =  s.getBytes();
 //       outputStream.write(c);
 //       outputStream.close();
        fileWriter.write(x);
        fileWriter.close();

    }
}
