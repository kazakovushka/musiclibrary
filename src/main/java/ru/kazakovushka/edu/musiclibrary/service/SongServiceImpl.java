package ru.kazakovushka.edu.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kazakovushka.edu.musiclibrary.model.Song;
import ru.kazakovushka.edu.musiclibrary.repository.SongRepository;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private SongRepository songRepository;

    @Override
    public void addSong(Song song) {
        songRepository.save(song);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Song> findByName(String name) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Song> findBySinger(String singer) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Song> findAll() {
        return null;
    }

    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
}
