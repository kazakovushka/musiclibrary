package ru.kazakovushka.edu.musiclibrary.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.kazakovushka.edu.musiclibrary.model.Singer;

import java.util.UUID;

public interface SingerRepository extends PagingAndSortingRepository<Singer, UUID> {
    boolean existsByName(String name);
}
