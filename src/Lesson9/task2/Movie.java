package Lesson9.task2;

import java.util.Objects;

public class Movie {
    private final String name;
    private final int release;
    private final Genre genre;

    public Movie(String name, int release, Genre genre) {
        this.name = name;
        this.release = release;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getRelease() {
        return release;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) &&
                Objects.equals(release, movie.release) &&
                genre == movie.genre;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, release, genre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", release=" + release +
                ", genre=" + genre +
                '}';
    }
}
