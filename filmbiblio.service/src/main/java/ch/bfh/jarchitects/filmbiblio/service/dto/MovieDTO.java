package ch.bfh.jarchitects.filmbiblio.service.dto;

import java.util.List;

/**
 * Created by Jasmin on 03.11.2016.
 */
public class MovieDTO
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

    private String title;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    private String decription;

    public String getDecription()
    {
        return decription;
    }

    public void setDecription(String decription)
    {
        this.decription = decription;
    }

    private Integer release_year;

    public Integer getRelease_year()
    {
        return release_year;
    }

    public void setRelease_year(Integer release_year)
    {
        this.release_year = release_year;
    }

    private Long duration;

    public Long getDuration()
    {
        return duration;
    }

    public void setDuration(Long duration)
    {
        this.duration = duration;
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

    private List<WaitingList> waitinglist;

    public List<WaitingList> getWaitinglist()
    {
        return waitinglist;
    }

    public void setWaitinglist(List<WaitingList> waitinglist)
    {
        this.waitinglist = waitinglist;
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
}
