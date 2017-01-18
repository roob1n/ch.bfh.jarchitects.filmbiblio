package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class WaitingList
{
    private Movie movie;

    @ManyToOne
    @Id
    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    private Userr user;

    @ManyToOne
    @Id
    public Userr getUser()
    {
        return user;
    }

    public void setUser(Userr user)
    {
        this.user = user;
    }

    private Date request_date;

    @Basic
    @Temporal(TemporalType.DATE)
    public Date getRequest_date()
    {
        return request_date;
    }

    public void setRequest_date(Date request_date)
    {
        this.request_date = request_date;
    }


}
