package ru.kazakovushka.edu.musiclibrary.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kazakovushka.edu.musiclibrary.model.Song;

import java.util.UUID;

public interface SongRepository extends CrudRepository<Song, UUID> {

}
