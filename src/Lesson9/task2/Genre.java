package Lesson9.task2;

//Задан интерфейс поисковика фильмов по году выпуска:
//public interface MovieYearFinder {
//   void add(Movie movie);
//   List<Movie> findByReleaseYear(int releaseYear);
//   List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear);
//}
//
//Объект типа MovieYearFinder хранит объекты Movie (название, год выпуска, жанр) и предоставляет функционал
// быстрого поиска фильмов по заданному году выпуска и диапазону годов выпуска.
//Написать класс MapMovieYearFinder, который реализует интерфейс MovieYearFinder с использованием TreeMap.
// Все операции из интерфейса должны выполняться за логарифмическое время O(log2N) (или близкое к логарифмическому).

public enum Genre {
    DRAMA,
    CRIME,
    COMEDY,
    ACTIONE,
    WAR,
    HORROR
}
