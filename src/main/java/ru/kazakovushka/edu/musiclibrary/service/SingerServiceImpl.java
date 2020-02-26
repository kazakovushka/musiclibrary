package ru.kazakovushka.edu.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kazakovushka.edu.musiclibrary.model.Singer;
import ru.kazakovushka.edu.musiclibrary.repository.SingerRepository;

@Service
public class SingerServiceImpl implements SingerService {

    private SingerRepository singerRepository;

    @Override
    public void addSinger(Singer singer) {
        singerRepository.save(singer);
    }

    @Autowired
    public void setSingerRepository(SingerRepository singerRepository) {
        this.singerRepository = singerRepository;
    }
}
