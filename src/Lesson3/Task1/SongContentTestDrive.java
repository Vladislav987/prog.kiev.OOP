package Lesson3.Task1;

import java.util.ArrayList;
import java.util.List;

public class SongContentTestDrive {
    public static void main(String[] args) {
        byte[] x = {4,6,7,2};
        SongContent b = new SongContent(x);
        List<SongContent> a = new ArrayList<SongContent>();

        SongContent z = new SongContent(new byte[]{5,6,7,8});

        System.out.println(b.toString());
        System.out.println();
        System.out.println(z.toString());
    }


}
