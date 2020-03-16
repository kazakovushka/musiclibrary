package ru.kazakovushka.edu.musiclibrary.service;

import ru.kazakovushka.edu.musiclibrary.model.Singer;

import java.util.List;
import java.util.UUID;

public interface SingerService  {
     Singer createSinger(Singer singer) throws IllegalArgumentException;
     Singer readSingerById(UUID id);
     List<Singer> readAll();
     void deleteSinger(UUID id);
     Singer updateSinger(UUID id, Singer singer) throws IllegalArgumentException;



}
