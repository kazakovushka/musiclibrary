package ru.kazakovushka.edu.musiclibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kazakovushka.edu.musiclibrary.model.Song;
import ru.kazakovushka.edu.musiclibrary.service.SongService;

import java.util.List;
import java.util.UUID;

@RestController
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping(path = "/songs")
    public List<Song> readAllSongs(){
        return songService.readAllSongs();
    }

    @GetMapping(path = "/songs/{id}")
    public Song readSongById(@PathVariable UUID id){
        return songService.readSongById(id);
    }

    @PostMapping(path = "/songs")
    public Song createSong(@RequestBody Song song){
        return songService.createSong(song);
    }

    @DeleteMapping(path = "/songs/{id}")
    public void deleteSong(@PathVariable UUID id){
        songService.deleteSong(id);
    }

    @PutMapping(path = "/songs/{id}")
    public Song updateSong(@PathVariable UUID id, @RequestBody Song song){
        return songService.updateSong(id, song);
    }

}
