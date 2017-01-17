package ch.bfh.jarchitects.filmbiblio.service.dto;

import java.io.Serializable;

/**
 * Created by Jasmin on 03.11.2016.
 */
public class DvdDTO implements Serializable
{
    private Long id;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    private UserDTO owner;

    public UserDTO getOwner()
    {
        return owner;
    }

    public void setOwner(UserDTO owner)
    {
        this.owner = owner;
    }

    private MovieDTO movie;

    public MovieDTO getMovie()
    {
        return movie;
    }

    public void setMovie(MovieDTO movie)
    {
        this.movie = movie;
    }
}
