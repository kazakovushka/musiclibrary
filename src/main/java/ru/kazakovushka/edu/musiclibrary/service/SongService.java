package ru.kazakovushka.edu.musiclibrary.service;

import ru.kazakovushka.edu.musiclibrary.model.Song;

import java.util.List;

public interface SongService {

     void addSong(Song song);
     List<Song> findByName(String name);
     List<Song> findBySinger(String singer);
     List<Song> findAll();
}
