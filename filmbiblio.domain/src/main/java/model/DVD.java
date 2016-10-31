package model;

/**
 * Created by Marc on 31.10.2016.
 */
public class DVD {
    private boolean lendable;
    private byte condition;
    private Movie movie;

    public DVD( Movie movie ) {
        this.movie = movie;

    }

    public boolean isLendable() {
        return this.lendable;

    }


}
