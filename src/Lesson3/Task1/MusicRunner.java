package Lesson3.Task1;

//Task1 1 (MusicApp)
//
//На основании UML диаграммы написать классы SongContent, Song, Playlist, User, реализовать методы.
//Создать тестовый класс MusicRunner, демонстрирующий работу предыдущих классов.

public class MusicRunner {
    public static void main(String[] args) {
        User vadyon = new User("Vladislav");

        vadyon.createPlaylist("The best songs");
        vadyon.addSongToPlayList("The best songs", new Song("Rain", "Robby Will", "Pop", 5, new SongContent(new byte[]{4, 7, 9, 13})));
        vadyon.addSongToPlayList("The best songs", new Song("Sun", "Luis Patric", "Pop", 4, new SongContent(new byte[]{7, 1, 3, 11})));
        vadyon.addSongToPlayList("The best songs", new Song("Rain", "Jerard", "Rock", 6, new SongContent(new byte[]{1, 1, 5, 10})));
        vadyon.addSongToPlayList("The best songs", new Song("Sea", "Jerard", "Pank", 3, new SongContent(new byte[]{1, 1, 5, 10})));

        vadyon.createPlaylist("Sport");
        vadyon.addSongToPlayList("Sport", new Song("Go Dynamo", "Human", "Rock", 7, new SongContent(new byte[]{2, 3})));
        vadyon.addSongToPlayList("Sport", new Song("We`a the Champions", "Qeen", "Rock", 5, new SongContent(new byte[]{2, 3})));

        System.out.println(vadyon.getName());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(vadyon.findByTitle("The best songs").findByAuthor("Jerard"));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(vadyon.findByTitle("The best songs").findByTitelPart("rain"));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(vadyon.findByTitle("The best songs").getTotalLenght());
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("FINDbyTITLE" + vadyon.findByTitle("Sport1"));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(vadyon.findByTitle("Sport").getTotalLenght());
    }
}

//Vladislav
//---------------------------------------------------------------------------
//[Song{title='Rain', author='Jerard', genre='Rock', lenght=6, content=SongContent{content=[1, 1, 5, 10]}}
//, Song{title='Sea', author='Jerard', genre='Pank', lenght=3, content=SongContent{content=[1, 1, 5, 10]}}
//]
//---------------------------------------------------------------------------
//[Song{title='Rain', author='Robby Will', genre='Pop', lenght=5, content=SongContent{content=[4, 7, 9, 13]}}
//, Song{title='Rain', author='Jerard', genre='Rock', lenght=6, content=SongContent{content=[1, 1, 5, 10]}}
//]
//---------------------------------------------------------------------------
//18.0
//---------------------------------------------------------------------------
//Playlist{title='Sport', songs=[Song{title='Go Dynamo', author='Human', genre='Rock', lenght=7, content=SongContent{content=[2, 3]}}
//, Song{title='We`a the Champions', author='Qeen', genre='Rock', lenght=5, content=SongContent{content=[2, 3]}}
//]}
//---------------------------------------------------------------------------
//12.0