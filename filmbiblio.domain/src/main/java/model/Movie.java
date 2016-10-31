package model;

/**
 * Created by Marc on 31.10.2016.
 */
public class Movie {
    private final short releaseYear;
    private final short duration;

    private String title;
    private byte rating;
    private String description;


    public Movie( String title, short releaseYear, short duration ) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;

    }

    public Movie( String name ) {
        this( name, ( (short)0 ), (short)0 );

    }


}
