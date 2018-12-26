package lesson12.iO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IntWrithe {
    public static void main(String[] args) throws IOException {
        FileInputStream ink = new FileInputStream("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\sourse.txt");
        OutputStream out =  new FileOutputStream("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\target.txt");
      /*  int a = ink.read();
        out.write(a);
        while (a!= -1){
            a = ink.read();
            out.write(a);
        }*/
      try {
          int b;
          while ((b = ink.read()) != -1) {
              System.out.println(b);
              out.write(b);
          }
      }catch (IOException e){
          throw new IOException("Ошибка");
      }finally {
          ink.close();
          out.close();
      }

    }
}
