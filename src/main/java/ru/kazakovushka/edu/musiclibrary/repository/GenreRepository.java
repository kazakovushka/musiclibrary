package ru.kazakovushka.edu.musiclibrary.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kazakovushka.edu.musiclibrary.model.Genre;

import java.util.UUID;

public interface GenreRepository extends CrudRepository<Genre, UUID> {
    boolean existsByName(String name);
}
