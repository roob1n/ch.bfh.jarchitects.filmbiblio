package ch.bfh.jarchitects.filmbiblio.service.dto;

import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */
public class UserDTO
{
    private String userid;

    public String getUserid()
    {
        return userid;
    }

    public void setUserid(String userid)
    {
        this.userid = userid;
    }

    private String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    private String password;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    private List<DvdDTO> dvds;

    public List<DvdDTO> getDvds()
    {
        return dvds;
    }

    public void setDvds(List<DvdDTO> dvds)
    {
        this.dvds = dvds;
    }

    private List<RentDTO> rents;

    public List<RentDTO> getRents()
    {
        return rents;
    }

    public void setRents(List<RentDTO> rents)
    {
        this.rents = rents;
    }

    private List<MovieReviewDTO> reviews;

    public List<MovieReviewDTO> getReviews()
    {
        return reviews;
    }

    public void setReviews(List<MovieReviewDTO> reviews)
    {
        this.reviews = reviews;
    }

    private List<WaitingListDTO> waitinglist;

    public List<WaitingListDTO> getWaitinglist()
    {
        return waitinglist;
    }

    public void setWaitinglist(List<WaitingListDTO> waitinglist)
    {
        this.waitinglist = waitinglist;
    }
}
