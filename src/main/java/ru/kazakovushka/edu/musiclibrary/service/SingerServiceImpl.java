package ru.kazakovushka.edu.musiclibrary.service;

import ru.kazakovushka.edu.musiclibrary.model.Singer;
import ru.kazakovushka.edu.musiclibrary.repository.SingerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class SingerServiceImpl implements SingerService {

    private SingerRepository singerRepository;

    public SingerServiceImpl(SingerRepository singerRepository) {
        this.singerRepository = singerRepository;
    }

    @Override
    public Singer createSinger(Singer singer) throws IllegalArgumentException {
        if (singerRepository.existsByName(singer.getName())) {
            throw new IllegalArgumentException("singer already exists");
        } else {
            return singerRepository.save(singer);
        }
    }

    @Override
    public Singer readSingerById(UUID id) {
        return singerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Singer> readAll() {
        List<Singer> singers = new ArrayList<>();
        singerRepository.findAll().iterator().forEachRemaining(singer -> singers.add(singer));
        return singers;
    }

    @Override
    public void deleteSinger(UUID id) throws IllegalArgumentException {
        singerRepository.deleteById(id);
    }

    @Override
    public Singer updateSinger(UUID id, Singer singer) throws IllegalArgumentException{
        Singer s = singerRepository.findById(id).get();
        if(s == null){
            throw new IllegalArgumentException("singer doesn't exist");
        } else {
            s.setName(singer.getName());
            s.setYearOfBirth(singer.getYearOfBirth());
            singerRepository.save(s);
            return s;
        }
    }
}
