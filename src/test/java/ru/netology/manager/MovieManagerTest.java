package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void shouldGetMovies() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "Bladshot", "thriller", "red");
        Movie second = new Movie(2, "Forward", "cartoon", "blue");
        Movie third = new Movie(3, "Hotel Belgrad", "camedy", "colored");
        manager.save(first);
        manager.save(second);
        manager.save(third);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast10() {
    }

    @Test
    void save() {
    }
}