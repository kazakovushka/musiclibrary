package ru.kazakovushka.edu.musiclibrary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import ru.kazakovushka.edu.musiclibrary.model.Genre;
import ru.kazakovushka.edu.musiclibrary.service.GenreService;
import ru.kazakovushka.edu.musiclibrary.service.SingerService;
import ru.kazakovushka.edu.musiclibrary.service.SongService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback
class MusiclibraryApplicationTests {

    @Autowired
    GenreService genreService;

    @Autowired
    SongService songService;

    @Autowired
    SingerService singerService;


    @Test
    void contextLoads() {
    }

    @Test
    void genreTest(){
       Genre g =  genreService.createGenre("pop");
       assertNotNull(g.getId());
       assertEquals("pop", g.getName());

    }

   /* @Test
    void fillInDb() {
        Genre hiphop = new Genre();
        hiphop.setName("hip-hop");
        genreService.addGenre(hiphop);

        Song song1 = new Song();
        song1.setLength("03:55");
        song1.setYear(2002);
        Set<Genre> genres = new HashSet<>();
        genres.add(hiphop);
        song1.setGenres(genres);
        songService.addSong(song1);

        Singer basta = new Singer();
        basta.setName("Basta");
        Set<Song> songs = new HashSet<>();
        songs.add(song1);
        basta.setSongs(songs);
        singerService.addSinger(basta);


    }

  /*  @Test
    public void testFindByName() {
        Genre genres = genreService.findByName("hip-hop");
        Assertions.assertTrue(genres !=null);
    }
    */


    @Test
    public void testFindAll() {
        List<Genre> genres = genreService.readAll();
        genres.stream().forEach(System.out::println);
        assertTrue(genres.size() > 0);
    }


}
