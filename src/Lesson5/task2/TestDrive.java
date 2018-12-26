package Lesson5.task2;

public class TestDrive {
    public static void main(String[] args) {
        File file = new File("Ветер", 10);
        File file1 = new File("Ураган", 20);
        File file2 = new File("Солнце", 30);
        File file3 = new File("Ночь", 10);
        Symlink symlink = new Symlink("Сильный", file);
        Symlink symlink1 = new Symlink("Яркое ", file2);
        System.out.println("Символическая ссылка = " + symlink.getName());
        System.out.println("Символическая ссылка = " + symlink1.getName());
        Directory directory = new Directory("Погода");
        directory.add(file);
        directory.add(file1);
        directory.add(file2);
        directory.add(file3);
        System.out.println(directory.toString());
        System.out.println("Размер Директории - " + directory.getSize());
        System.out.println("Имя Директории - " + directory.getName());
        System.out.println("---------------------------------");
        Directory a = new Directory("Song").add(new Directory("Roc").add(new File("Queen", 126)));
        System.out.println(a.toString());
    }
}

//Символическая ссылка = Сильный ->Ветер
//Символическая ссылка = Яркое  ->Солнце
//Directory{name = Погода, item=[File{name = Ветер, size = 10}, File{name = Ураган, size = 20}, File{name = Солнце, size = 30}, File{name = Ночь, size = 10}]}
//Размер Директории - 70
//Имя Директории - Погода
//---------------------------------
//Directory{name = Song, item=[Directory{name = Roc, item=[File{name = Queen, size = 126}]}]}

