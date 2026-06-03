package src.main.java.com.lg.oop;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-03  17:41
 */
public class MoveTest {
    public static void main(String[] args) {
        //create an array of movies
        Movie[] movies = new Movie[6];
        //create movies
        movies[0] = new Movie("《唐顿庄园》", 1, 9.5, "Tim Allen");
        movies[1] = new Movie("《速度与激情》", 2, 20.0, "Vin Diesel");
        movies[2] = new Movie("《泰坦尼克号》", 3, 15.5, "Leonardo DiCaprio");
        movies[3] = new Movie("《吸血鬼日记》", 4, 5.5, "Kevin Spacey");
        movies[4] = new Movie("《爱情公寓》", 5, 29.5, "Ryan Gosling");
        movies[5] = new Movie("《唐朝诡事录》", 6, 19.5, "Tom Hanks");

        MovieOperator movieOperator = new MovieOperator(movies);
        //print all movies
        movieOperator.printAllMovies();
        System.out.println("=========================================");
        //print movies by id
        movieOperator.printMoviesById();

    }
}
