package lesson12.iO;

import java.io.*;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        String bu = new Scanner(System.in).nextLine();
        try {
            in = new FileInputStream("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\sourse.txt"); // відкрити потік вводу
            out = new FileOutputStream("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\target.txt", true);// відкрити потік виводу


            Writer writer = new OutputStreamWriter(out, "UTF8");
            writer.write(bu +"\t");
            writer.close();
  //          while (c != null) { // читати з потоку вводу
 //               System.out.println(c);
//                writer.write(c ); // писати в потік виводу
 //           }
        } finally { // закривати потоки в секції finally
            if (in != null) {
                in.close(); // закрити потік вводу
            }
            if (out != null) {
                out.close(); // закрити потік виводу
            }

        }
    }
}
