package service;

import models.Movie;
import models.Producer;

import java.util.List;

public interface SortAble {

    List<Movie> sortByMovieName(String ascOrDesc);

    List<Movie> sortByYear(String ascOrDesc);

    List<Producer> sortByProducer();
}
