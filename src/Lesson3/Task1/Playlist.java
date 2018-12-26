package Lesson3.Task1;

import java.util.ArrayList;

public class Playlist {
    private final String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public double getTotalLenght(){
        double totalLenght = 0;
        for(Song elem: songs){
            totalLenght += elem.getLenght();
        }
        return totalLenght;
    }

    public ArrayList<Song> findByTitelPart(String nameTitel) {
        ArrayList<Song> titelSongs = new ArrayList<>();
        for (Song elem : songs) {
            if (elem.getTitle().equalsIgnoreCase(nameTitel)) {
                titelSongs.add(elem);
            }
        }
        return titelSongs;
    }
        public ArrayList<Song> findByAuthor(String nameAuthor){
            ArrayList<Song> author = new ArrayList<>();
            for (Song elem: songs){
                if ( elem.getAuthor().equalsIgnoreCase(nameAuthor)){
                    author.add(elem);
                }
            }
            return author;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
