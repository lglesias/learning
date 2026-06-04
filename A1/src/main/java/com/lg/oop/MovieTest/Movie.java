package src.main.java.com.lg.oop.MovieTest;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop
 * @since 2026-06-03  17:41
 */
public class Movie {
    //movie name
    private String name;
    //movie id
    private int id;
    //movie price
    private double price;
    //movie actor
    private String actor;

    //Constructor
    public Movie() {
    }

    public Movie(String name, int id, double price, String actor) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.actor = actor;
    }

    /**
     * getter and setter
     *
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
