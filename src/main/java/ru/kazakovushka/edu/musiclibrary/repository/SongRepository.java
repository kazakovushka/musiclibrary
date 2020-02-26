package ru.kazakovushka.edu.musiclibrary.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kazakovushka.edu.musiclibrary.model.Song;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Integer> {
     List<Song> findByName(String name);
}
