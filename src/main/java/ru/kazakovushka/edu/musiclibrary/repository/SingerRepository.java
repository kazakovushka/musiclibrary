package ru.kazakovushka.edu.musiclibrary.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.kazakovushka.edu.musiclibrary.model.Singer;

public interface SingerRepository extends PagingAndSortingRepository<Singer, Integer> {
}
