package lesson12.iO;


import java.io.File;


public class FileMeneger {
    public static void main(String[] args) {
        File file = new File("E:\\Project\\JavaStart\\src\\");
        File[] files = file.listFiles();
        for(File elem: files){
            if (elem.isDirectory()){
                System.out.println(elem.getAbsolutePath());
            }
        }
    }
}
