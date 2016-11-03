package model;

import java.util.ArrayList;

/**
 * Created by Marc on 31.10.2016.
 */
public class Library {
    private String name;
    ArrayList<DVD> dvds;

    public Library( String name ) {
        this.name = name;
        this.dvds = new ArrayList<DVD>();

    }

    public DVD rentDVD( String name, User user, long condition ) {
        return this.dvds.get( 0 );

    }

    public boolean addDVD( DVD dvd) {
        return this.dvds.add( dvd );

    }

}
