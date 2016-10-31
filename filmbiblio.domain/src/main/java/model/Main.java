package model;

/**
 * Created by Marc on 31.10.2016.
 */
public class Main {
    public static void main( String[] args ) {
        Library library = new Library( "dummy library");
        library.addDVD( new DVD( new Movie( "Inception", (short)2010, (short)148 ) ) );

        User bobby = new User( "bobbysEmail", "bobby", "1234" );

        library.rentDVD( "Inception", bobby, 0 );



    }

}
