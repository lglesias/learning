package src.main.java.com.lg.oop;

import java.util.Scanner;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-03  17:53
 */
public class MovieOperator {
    //create an array of movies
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //print all movies
    public void printAllMovies() {
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getId() + " \t "
                    + movie.getName() + " \t "
                    + movie.getPrice() + " \t "
                    + movie.getActor());
        }
    }

    //print movies by id
    public void printMoviesById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the movie id.");
        Integer movieId = scanner.nextInt();
        //find the movie
        for (int i = 0; i < movies.length; i++) {
            //get the movie
            Movie movie = movies[i];
            //compare the movie id
            if (movieId.equals(movie.getId())) {
                System.out.println(movie.getId() + " \t "
                        + movie.getName() + " \t "
                        + movie.getPrice() + " \t "
                        + movie.getActor());
                return;
            }
        }
        System.out.println("Movie not found.");
    }

}