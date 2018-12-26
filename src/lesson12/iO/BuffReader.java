package lesson12.iO;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class BuffReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\sourse.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\Lessons\\Proff\\prog.kiev.OOP\\src\\lesson12\\target.txt"));
        String line = null;
        TreeSet<String> a = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        try {
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                a.add(line);
            }
            for (String elem: a){
                bufferedWriter.write(elem +"\n");
            }
        }catch (IOException e){
            throw new IOException("Attention!!! ERROR");
        }finally {
            bufferedReader.close();
            bufferedWriter.close();
        }

    }
}
// IN
//jsdlfkjdslfjsldfjalsjfdld
//fd;lkfkmsdfsd;fsd;f;
//fkdsglksnglrnglf4
//dsfdsfsfsf
//dfsdfsdf
//fdsfsd
//dfd

//OUT
//dfd
//fdsfsd
//dfsdfsdf
//dsfdsfsfsf
//fkdsglksnglrnglf4
//fd;lkfkmsdfsd;fsd;f;
//jsdlfkjdslfjsldfjalsjfdld

