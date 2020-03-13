package ru.kazakovushka.edu.musiclibrary.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kazakovushka.edu.musiclibrary.model.Genre;
import ru.kazakovushka.edu.musiclibrary.service.GenreService;
import java.util.List;
import java.util.UUID;

@RestController
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping("/genres/{id}")
    public Genre readGenreById(@PathVariable UUID id){
        return genreService.readById(id);
    }

    @GetMapping("/genres")
    public List<Genre> readAllGenres(){
        return genreService.readAll();
    }

    @PostMapping(path = "/genres")
    public Genre createGenre(@RequestBody String name){
       return genreService.createGenre(name);
    }

    @DeleteMapping("genres/{id}")
    public void deleteGenre(@PathVariable UUID id){
       genreService.deleteGenre(id);
    }

    @PutMapping(path = "/genres/{id}")
    public Genre updateGenre(@PathVariable UUID id, @RequestBody String name){
       return genreService.updateGenre(id,name);
    }
}
