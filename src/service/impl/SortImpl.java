package service.impl;

import db.DataBase;
import models.Movie;
import models.Producer;
import service.SortAble;

import java.util.*;

public class SortImpl implements SortAble {
    @Override
    public List<Movie> sortByMovieName(String ascOrDesc) {
        List<Movie> movies = new LinkedList<>(DataBase.movies);
        Comparator<Movie> movieName = Comparator.comparing(Movie::getName);

        if (ascOrDesc.toLowerCase().contains("desc")){
            movies.sort(movieName.reversed());
        } else {
            movies.sort(movieName);
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Movie> sortByYear(String ascOrDesc) {
        List<Movie> movies = new LinkedList<>(DataBase.movies);
        Comparator<Movie> movieYear = Comparator.comparing(Movie::getYear);

        if (ascOrDesc.toLowerCase().contains("desc")){
            movies.sort(movieYear.reversed());
        } else {
            movies.sort(movieYear);
        }
        return movies.isEmpty() ? null : movies;
    }

    @Override
    public List<Producer> sortByProducer() {
        List<Producer> producers = new LinkedList<>(DataBase.producers);
        Comparator<Producer> producerComparator = Comparator.comparing(Producer::getFirstName);
        producers.sort(producerComparator);
        return producers.isEmpty() ? null : producers;
    }
}
