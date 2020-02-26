package ru.kazakovushka.edu.musiclibrary.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany
    private Set<Genre> genres;

    private String name;
    private String length;
    private int year;


    public Song() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", genres=" + genres +
                ", name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", year=" + year +
                '}';
    }
}
