package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class WaitingList
{
    private Date request_date;

    @Basic
    public Date getRequest_date()
    {
        return request_date;
    }

    public void setRequest_date(Date request_date)
    {
        this.request_date = request_date;
    }

    private Movie movie;

    @ManyToOne
    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    private User user;

    @ManyToOne
    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
