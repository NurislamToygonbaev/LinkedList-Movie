package db;

import enums.Genre;
import models.Actor;
import models.Movie;
import models.Producer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataBase {

    static List<Actor> actors = new LinkedList<>(Arrays.asList(
            new Actor(1, "Nurlan", "main"),
            new Actor(2, "Urmat", "pom"),
            new Actor(3, "Nurmuhammed", "glav"),
            new Actor(4, "Nurtaazim", "ved"),
            new Actor(5, "Mika", "ved m")
    ));
    static List<Actor> actors2 = new LinkedList<>(Arrays.asList(
            new Actor(1, "Baha", "main"),
            new Actor(2, "Aikyz", "pom"),
            new Actor(3, "Zepa", "glav"),
            new Actor(4, "Nurtilek", "ved"),
            new Actor(5, "Datka", "ved m")
    ));
    static List<Actor> actors3 = new LinkedList<>(Arrays.asList(
            new Actor(1, "Aiturgan", "main"),
            new Actor(2, "Mirlan", "pom"),
            new Actor(3, "Nurgazy", "glav"),
            new Actor(4, "Zaripbek", "ved"),
            new Actor(5, "Gulumkan", "ved m")
    ));

    static Producer producer1 = new Producer(1, "Nurislam", "Toigonbaev");
    static Producer producer2 = new Producer(2, "Myrzaiym", "Keldibekova");
    static Producer producer3 = new Producer(3, "Nurkamil", "Kamchiev");

   public static List<Producer> producers = new LinkedList<>(Arrays.asList(
            producer1, producer2, producer3
    ));

   public static List<Movie> movies = new LinkedList<>(Arrays.asList(
            new Movie(1, "spusk", 2009, Genre.HORROR, producer1, actors),
            new Movie(2, "mstiteli", 2017, Genre.FANTASY, producer2, actors2),
            new Movie(3, "vpityk", 2013, Genre.COMEDY, producer3, actors3)
    ));
}
