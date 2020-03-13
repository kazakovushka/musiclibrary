package ru.kazakovushka.edu.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kazakovushka.edu.musiclibrary.model.Song;
import ru.kazakovushka.edu.musiclibrary.repository.SongRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class SongServiceImpl implements SongService {


    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song readSongById(UUID id) {
        return songRepository.findById(id).orElse(null);
    }

    @Override
    public List<Song> readAllSongs() {
        List<Song> songs = new ArrayList<>();
        songRepository.findAll().iterator().forEachRemaining(song -> songs.add(song));
        return songs;
    }

    @Override
    public Song updateSong(UUID id, Song song) throws IllegalArgumentException{
        Song s = songRepository.findById(id).get();
        if(s==null){
            throw new IllegalArgumentException("song doesn't exist");
        }else{
            s.setGenres(song.getGenres());
            s.setSinger(song.getSinger());
            s.setLength(song.getLength());
            s.setName(song.getName());
            s.setYear(song.getYear());
            return s;
        }

    }

    @Override
    public void deleteSong(UUID id) {
         songRepository.deleteById(id);
    }
}
