package service.impl;

import db.DataBase;
import models.Movie;
import service.SortAble;

import java.util.*;

public class SortImpl implements SortAble{
    @Override
    public List<Movie> sortByMovieName(String ascOrDesc) {
        Comparator<Movie> movieName = Comparator.comparing(Movie::getName);

        if (ascOrDesc.toLowerCase().contains("desc")) {
            DataBase.movies.sort(movieName.reversed());
            return DataBase.movies;
        } else if (ascOrDesc.toLowerCase().contains("asc")) {
            DataBase.movies.sort(movieName);
            return DataBase.movies;
        }
        return null;
    }

    @Override
    public List<Movie> sortByYear(String ascOrDesc) {
        Comparator<Movie> movieYear = Comparator.comparing(Movie::getYear
        );

        if (ascOrDesc.toLowerCase().contains("desc")) {
            DataBase.movies.sort(movieYear.reversed());
            return DataBase.movies;
        } else if (ascOrDesc.toLowerCase().contains("asc")) {
            DataBase.movies.sort(movieYear);
            return DataBase.movies;
        }
        return null;
    }

    @Override
    public List<Movie> sortByProducer() {
        DataBase.movies.sort(SortImpl.comparator);
        return DataBase.movies;
    }

    public static Comparator<Movie> comparator = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getProducer().getFirstName().compareTo(o2.getProducer().getFirstName());
        }
    };
}
