package models;

import enums.Genre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Movie {
    private long id;
    private String name;
    private int year;
    private Genre genre;
    public Producer producer;
    public List<Actor> actors = new LinkedList<>();

    public Movie() {
    }

    public Movie(long id, String name, int year, Genre genre, Producer producer, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actors = actors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie: {" +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre=" + genre + " }" +
                ", " + producer +
                ", " + actors + "\n";
    }
}
