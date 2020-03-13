package ru.kazakovushka.edu.musiclibrary.service;

import ru.kazakovushka.edu.musiclibrary.model.Song;

import java.util.List;
import java.util.UUID;

public interface SongService {

     Song createSong(Song song);
     Song readSongById(UUID id);
     List<Song> readAllSongs();
     Song updateSong(UUID id, Song song) throws IllegalArgumentException;
     void deleteSong(UUID id);
}
