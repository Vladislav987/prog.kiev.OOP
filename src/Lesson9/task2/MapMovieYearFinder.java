package Lesson9.task2;

import java.util.*;

public class MapMovieYearFinder implements MovieYearFinder {
    private final SortedMap<Integer, HashSet<Movie>> movies = new TreeMap<Integer, HashSet<Movie>>();


    @Override
    public void add(Movie movie) {
        if (movies.containsKey(movie.getRelease())) {
            movies.get(movie.getRelease()).add(movie);
        } else {
            movies.put(movie.getRelease(), new HashSet<Movie>());
            add(movie);
        }

    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear) {
        if (movies.containsKey(releaseYear)) {
            return new ArrayList<Movie>(movies.get(releaseYear));
        } else {
            return new ArrayList<>();
        }

    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear) {
        List<Movie> resul = new LinkedList<>();
        for (Set<Movie> elem: movies.subMap(minReleaseYear, maxReleaseYear).values()){
            resul.addAll(elem);
        }
        return resul;

    }


}
