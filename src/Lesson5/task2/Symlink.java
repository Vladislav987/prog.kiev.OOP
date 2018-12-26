package Lesson5.task2;

public class Symlink implements FSItem {
    private final String symlinkName;
    private final FSItem FSItem;

    public Symlink(String symlinkName, FSItem FSItem) {
        this.symlinkName = symlinkName;
        this.FSItem = FSItem;
    }

    @Override
    public String getName() {
        return symlinkName + " ->" + FSItem.getName();
    }

    @Override
    public int getSize() {
        return 1;
    }


    @Override
    public String toString() {
        return "Symlink{" +
                "symlinkName='" + symlinkName + '\'' +
                ", file=" + FSItem +
                '}';
    }
}
