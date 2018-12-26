package Lesson5.task2;

public abstract class NamedFSItem implements FSItem {
    private final String name;

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
