package ru.kazakovushka.edu.musiclibrary.service;

import ru.kazakovushka.edu.musiclibrary.model.Genre;

import java.util.List;
import java.util.UUID;

public interface GenreService {
    Genre readById(UUID id);

    List<Genre> readAll();

    Genre createGenre(String name) throws IllegalArgumentException;

    void deleteGenre(UUID id);

    Genre updateGenre(UUID id, String name) throws IllegalArgumentException;

}
