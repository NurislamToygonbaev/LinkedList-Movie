import enums.Genre;
import service.FindAble;
import service.SortAble;
import service.impl.FindImpl;
import service.impl.SortImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanForNumber = new Scanner(System.in);
        FindAble find = new FindImpl();
        SortAble sort = new SortImpl();

        try {
            LOOP:
            while (true){
                menu();
                switch (scanForNumber.nextInt()){
                    case 0 -> {break LOOP;}
                    case 1 -> System.out.println(find.getAllMovies());
                    case 2 -> {
                        System.out.print("enter name: ");
                        String name = scanner.nextLine();
                        if (find.findMovieByNameOrPartName(name) == null){
                            System.err.println("There is no such movie");
                        } else {
                            System.out.println(find.findMovieByNameOrPartName(name));
                        }
                    }
                    case 3 ->{
                        System.out.print("enter actor name: ");
                        String actorName = scanner.nextLine();
                        if (find.findMovieByActorName(actorName) == null){
                            System.err.println("There is no such movie");
                        } else {
                            System.out.println(find.findMovieByActorName(actorName));
                        }
                    }
                    case 4 -> {
                        System.out.print("enter year movie: ");
                        int year = scanForNumber.nextInt();
                        if (find.findMovieByYear(year) == null){
                            System.err.println("There is no such movie");
                        } else {
                            System.out.println(find.findMovieByYear(year));
                        }
                    }
                    case 5 -> {
                        System.out.print("enter producer name: ");
                        String producerName = scanner.nextLine();
                        if (find.findMovieByProducer(producerName) == null){
                            System.err.println("There is no such movie");
                        } else {
                            System.out.println(find.findMovieByProducer(producerName));
                        }
                    }
                    case 6 -> {
                        System.out.print("enter genre movie (COMEDY/HORROR/FANTASY): ");
                        String genre = scanner.nextLine();
                        if (genre.equalsIgnoreCase("comedy")){
                            if (find.findMovieByGenre(Genre.COMEDY) == null){
                                System.err.println("There is no such movie");
                            } else {
                                System.out.println(find.findMovieByGenre(Genre.COMEDY));
                            }
                        } else if (genre.equalsIgnoreCase("horror")){
                            if (find.findMovieByGenre(Genre.HORROR) == null){
                                System.err.println("There is no such movie");
                            } else {
                                System.out.println(find.findMovieByGenre(Genre.HORROR));
                            }
                        } else if (genre.equalsIgnoreCase("fantasy")){
                            if (find.findMovieByGenre(Genre.FANTASY) == null){
                                System.err.println("There is no such movie");
                            } else {
                                System.out.println(find.findMovieByGenre(Genre.FANTASY));
                            }
                        }
                    }
                    case 7 -> {
                        System.out.print("enter actor's role: ");
                        String actorRole = scanner.nextLine();
                        if (find.findMovieByRole(actorRole) == null){
                            System.err.println("There is no such movie");
                        } else {
                            System.out.println(find.findMovieByRole(actorRole));
                        }
                    }
                    case 8 -> {
                        System.out.print("enter asc or desc: ");
                        String ascOrDesc = scanner.nextLine();
                        if (sort.sortByMovieName(ascOrDesc) == null){
                            System.err.println("wrong command");
                        } else {
                            System.out.println(sort.sortByMovieName(ascOrDesc));
                        }
                    }
                    case 9 -> {
                        System.out.print("enter asc or desc: ");
                        String year = scanner.nextLine();
                        if (sort.sortByYear(year) == null){
                            System.err.println("wrong command");
                        } else {
                            System.out.println(sort.sortByYear(year));
                        }
                    }
                    case 10 -> System.out.println(sort.sortByProducer());
                    default -> System.err.println("write correct choice!!!");
                }
            }
        } catch (Exception e){
            System.err.println("write valid integer");
            scanForNumber.nextLine();
        }
    }

    private static void menu(){
        System.out.println("""
                0.  exit
                1.  get all movies
                2.  find movie by name or part name
                3.  find movie by actor name
                4.  find movie by year
                5.  find movie by producer
                6.  find movie by genre
                7.  find movie by role
                8.  sort by movie name
                9.  sort by year
                10. sort by producer
                """);
    }
}