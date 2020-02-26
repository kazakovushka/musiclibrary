package ru.kazakovushka.edu.musiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.kazakovushka.edu.musiclibrary.model.Genre;
import ru.kazakovushka.edu.musiclibrary.service.GenreService;

import java.util.List;

public class GenreRepositoryTest {

    @Autowired
    GenreService genreService;


  /*  @Test
    public void testFindByName() {
        Genre genre = genreService.findByName("folk");
        Assertions.assertTrue(genre != null);
    }

    @Test
    public void testFindAll() {
        List<Genre> genres = genreService.findAll();
        genres.stream().forEach(System.out::println);
        Assertions.assertTrue(genres.size() > 0);
    }
    */



}
