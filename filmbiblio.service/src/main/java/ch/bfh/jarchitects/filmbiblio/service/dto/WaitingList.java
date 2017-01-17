package ch.bfh.jarchitects.filmbiblio.service.dto;

import java.util.Date;

/**
 * Created by Jasmin on 03.11.2016.
 */
public class WaitingList
{
    private MovieDTO movie;

    public MovieDTO getMovie()
    {
        return movie;
    }

    public void setMovie(MovieDTO movie)
    {
        this.movie = movie;
    }

    private UserDTO user;

    public UserDTO getUser()
    {
        return user;
    }

    public void setUser(UserDTO user)
    {
        this.user = user;
    }

    private Date request_date;

    public Date getRequest_date()
    {
        return request_date;
    }

    public void setRequest_date(Date request_date)
    {
        this.request_date = request_date;
    }


}
