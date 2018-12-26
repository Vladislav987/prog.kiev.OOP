package lesson12.iO;

public class CharTest {
    public static void main(String[] args) {
        char c = 56208;
        char c1 = 0xFFFF;
        char c2 = 0x0000;
        char c3 = '\u12A3';
        c3++;

        String s = "\u12A3fdflsd fldfdslfk \u12A3";
        System.out.println(c);
        System.out.println(s);
    }
}

//ኣfdflsd fldfdslfk ኣ
