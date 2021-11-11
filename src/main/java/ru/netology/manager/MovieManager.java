package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor
@AllArgsConstructor
//@Data

public class MovieManager {
    private int counterMovies;
    private Movie[] movies = new Movie[0];

    public MovieManager(int counterMovies) {
        this.counterMovies = counterMovies;

    }
    public MovieManager() {
        this.counterMovies = 10;
    }

    public Movie[] getMovies() {
        return null;
    }

    public Movie[] findLast10() {
        int resultLength;
        if (movies.length >= 10)
        {
            resultLength = 10;
        } else{
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public void save(Movie item) {
        int length = movies.length +1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies,0,tmp,0,movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }



                     

}
