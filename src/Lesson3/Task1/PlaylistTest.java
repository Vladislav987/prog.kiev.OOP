package Lesson3.Task1;

public class PlaylistTest {
    public static void main(String[] args) {
        Song s1 = new Song("Rain","Robby Will", "Pop", 5, new SongContent(new byte[]{4,7,9,13}));
        Song s2 = new Song("Sun","Luis Patric", "Pop", 4, new SongContent(new byte[]{7,1,3,11}));
        Song s3 = new Song("Rain","Jerard", "Rock", 6, new SongContent(new byte[]{1,1,5,10}));
        Song s4 = new Song("Sea","Jerard", "Pank", 3, new SongContent(new byte[]{1,1,5,10}));

        Playlist p1 = new Playlist("Vlad");
        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong(s3);
        p1.addSong(s4);

        System.out.println(p1.getTotalLenght());
        System.out.println(p1.toString());
        System.out.println("___________________");

        System.out.println(p1.findByTitelPart("Rain"));

        System.out.println("--------------------");

        System.out.println(p1.findByAuthor("Jerard"));

    }
}
