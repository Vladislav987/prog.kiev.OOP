package Lesson3.Task1;

import java.util.ArrayList;

public class User {
    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Playlist> createPlaylist(String nameList) {
        Playlist p1 = new Playlist(nameList);
        playlists.add(p1);
        return playlists;
    }

    public Playlist findByTitle(String name) {
        //       ArrayList<Playlist> byTitle = new ArrayList<>();
        Playlist find = new Playlist(name);
        for (Playlist elem : playlists) {
            if (elem.getTitle().equalsIgnoreCase(name)) {
                find = elem;
                return find;
            }
        }
        return null;
    }

    public void addSongToPlayList(String name, Song nameSong) {
        for (Playlist elem : playlists) {
            if (elem.getTitle().equalsIgnoreCase(name)) {
                elem.addSong(nameSong);
            }
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}

