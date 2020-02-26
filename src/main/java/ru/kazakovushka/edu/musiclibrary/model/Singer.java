package ru.kazakovushka.edu.musiclibrary.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Singer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany
    private Set<Song> songs;

    private String name;


    public Singer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {

        return "Singer{" +
                "id=" + id +
                ", songs=" + songs.stream().toString() +
                '}';
    }
}
