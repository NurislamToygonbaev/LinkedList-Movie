package service.impl;

import db.DataBase;
import enums.Genre;
import models.Actor;
import models.Movie;
import service.FindAble;

import java.util.LinkedList;
import java.util.List;

public class FindImpl implements FindAble {
    @Override
    public List<Movie> getAllMovies() {
        return DataBase.movies;
    }

    @Override
    public List<Movie> findMovieByNameOrPartName(String name) {
        List<Movie> movies = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if (movie.getName().toLowerCase().contains(name.toLowerCase())) {
                movies.add(movie);
            }
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Movie> findMovieByActorName(String actorName) {
        List<Movie> movies = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            for (Actor actor : movie.actors) {
                if (actor.getFullName().toLowerCase().contains(actorName.toLowerCase())) {
                    movies.add(movie);
                }
            }
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Movie> findMovieByYear(int year) {
        List<Movie> movies = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if (movie.getYear() == year) {
                movies.add(movie);
            }
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Movie> findMovieByProducer(String producerName) {
        List<Movie> movies = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if (movie.getProducer().getFirstName().toLowerCase().contains(producerName.toLowerCase())){
                movies.add(movie);
            }
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Movie> findMovieByGenre(Genre genre) {
        List<Movie> movies = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            if (movie.getGenre().equals(genre)) {
                movies.add(movie);
            }
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Movie> findMovieByRole(String role) {
        List<Movie> movies = new LinkedList<>();
        for (Movie movie : DataBase.movies) {
            for (Actor actor : movie.actors) {
                if (actor.getFullName().toLowerCase().contains(role.toLowerCase())) {
                    movies.add(movie);
                }
            }
        }
        return movies.isEmpty() ? null : movies;
    }
}
