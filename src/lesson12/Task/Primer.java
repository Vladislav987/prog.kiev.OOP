package lesson12.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Primer {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("hfp");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");
        List<String> b = new ArrayList<>() ;
        b.add("3");
        b.add("7");
        list.addAll(b);
        list.add("end");
        BufferedWriter out = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\1111.txt"));
        try{
            String s = "gfnfgg";
            for (int i = 0; i < list.size(); i++){

                out.write(list.get(i) + "\n");
            }

        }catch (IOException e){
            System.out.println("Error");
        }finally {
          out.close();
        }
    }
}
