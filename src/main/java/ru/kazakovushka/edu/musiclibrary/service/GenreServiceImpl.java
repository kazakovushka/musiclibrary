package ru.kazakovushka.edu.musiclibrary.service;

import org.springframework.transaction.annotation.Transactional;
import ru.kazakovushka.edu.musiclibrary.model.Genre;
import ru.kazakovushka.edu.musiclibrary.repository.GenreRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class GenreServiceImpl implements GenreService {

    private GenreRepository repository;

    public GenreServiceImpl(GenreRepository repository) {
        this.repository = repository;
    }

    @Override
    public Genre createGenre(String name) {
        if(!repository.existsByName(name)){
            Genre g = new Genre();
            g.setName(name);
            repository.save(g);
            return g;
        } else{
            throw new IllegalArgumentException("name already exists");
        }
    }

    @Override
    public void deleteGenre(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public Genre updateGenre(UUID id, String name) {
        Optional<Genre> go = repository.findById(id);

        if(go.isPresent()){
            Genre g = go.get();
            g.setName(name);
            repository.save(g);
            return g;
        }
        else{
            throw new IllegalArgumentException("genre not exists");
        }
    }


    @Override
    @Transactional(readOnly = true)
    public Genre readById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Genre> readAll() {
        List<Genre> genres = new ArrayList<>();
        repository.findAll().iterator().forEachRemaining(genres::add);
        return genres;
    }
}
