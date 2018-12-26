package Lesson5.task2;

public class File extends NamedFSItem {
    private final int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" + "name = " + getName() +
                ", size = " + size +
                '}';
    }
}
