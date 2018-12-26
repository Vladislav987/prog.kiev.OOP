package Lesson5.task2;

// Смоделировать файловую систему, работающую с файлами, директориями и символическими ссылками (ярлыками). Работать с реальной файловой системой (создавать файлы/директории, читать контент файлов) не нужно; необходимо реализовать только модель.
//Каждый элемент файловой системы имеет название и размер (в килобайтах).
//Типы элементов файловой системы:
//Файл (File).
//Фиксированное название, которое передается в конструкторе.
//Фиксированный размер, который передается в конструкторе.
//Директория (Directory) - содержит в себе другие элементы файловой системы (например, файлы и другие директории).
//Фиксированное название, которое передается в конструкторе.
//Размер считается по содержимому.
//Символическая ссылка или ярлык (Symlink) - ссылается на другой элемент файловой системы (например, на директорию или другую символическую ссылку);
//Название генерируется динамически. Формат названия: “{symlinkName} -> {fsItemName}”.
//File file = new File("hello.txt", 10);
//Symlink symlink = new Symlink("my-doc.txt", file);
//symlink.getName() -> "my-doc.txt -> hello.txt"
//Размер всегда равен 1 KB.
//
//В реализации использовать интерфейсы и абстрактные классы.

import java.util.ArrayList;
import java.util.List;

public class Directory extends NamedFSItem {
    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) throws IllegalArgumentException {
        if (item instanceof Directory) {
            if (item.equals(this)) {
                throw new IllegalArgumentException("You can`t add directory into itself1");
            }
            ChekDirectory((Directory) item);
        }
        items.add(item);
        return this;
    }

    private void ChekDirectory(Directory directory) {
        List<FSItem> items = directory.items;
        for (FSItem elem : items) {
            if (elem.equals(this))
                throw new IllegalArgumentException(" You can`t add directory into itself2");
        }
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FSItem elem : items) {
            size += elem.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "Directory{" + "name = " + getName() +
                ", item=" + items +
                '}';
    }
}
