package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class MovieReview
{
    private Userr reviewer;

    @ManyToOne
    @Id
    public Userr getReviewer()
    {
        return reviewer;
    }

    public void setReviewer(Userr reviewer)
    {
        this.reviewer = reviewer;
    }

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

    private Integer rating;

    @Basic
    public Integer getRating()
    {
        return rating;
    }

    public void setRating(Integer rating)
    {
        this.rating = rating;
    }

    private String review;

    @Basic
    public String getReview()
    {
        return review;
    }

    public void setReview(String review)
    {
        this.review = review;
    }


}
