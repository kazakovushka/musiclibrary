package ru.kazakovushka.edu.musiclibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kazakovushka.edu.musiclibrary.model.Singer;
import ru.kazakovushka.edu.musiclibrary.model.Song;
import ru.kazakovushka.edu.musiclibrary.service.SingerService;

import java.util.List;
import java.util.UUID;

@RestController
public class SingerController {

    @Autowired
    private SingerService singerService;

    @GetMapping(path = "/singers/{id}")
    public Singer readSingerById(@PathVariable UUID id){
        return singerService.readSingerById(id);
    }

    @GetMapping(path = "/singers")
    public List<Singer> readAll(){
        return singerService.readAll();
    }

    @PostMapping(path = "/singers")
    public Singer createSinger(@RequestBody Singer singer){
        return singerService.createSinger(singer);
    }

    @DeleteMapping(path = "/singers/{id}")
    public void deleteSinger(@PathVariable UUID id){
         singerService.deleteSinger(id);
    }

    @PutMapping(path = "/singers/{id}")
    public Singer updateSinger(@PathVariable UUID id, @RequestBody Singer singer){
        return singerService.updateSinger(id, singer);
    }

    //songs

    @GetMapping(path = "/singers/{id}/songs")
    public List<Song> findSongsBySingerId(@PathVariable UUID id){
return null;
    }

}
