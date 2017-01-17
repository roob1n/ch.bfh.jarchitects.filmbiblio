package ch.bfh.jarchitects.filmbiblio.service.dto;

/**
 * Created by Jasmin on 03.11.2016.
 */
public class MovieReviewDTO
{
    private UserDTO reviewer;

    public UserDTO getReviewer()
    {
        return reviewer;
    }

    public void setReviewer(UserDTO reviewer)
    {
        this.reviewer = reviewer;
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

    private Integer rating;

    public Integer getRating()
    {
        return rating;
    }

    public void setRating(Integer rating)
    {
        this.rating = rating;
    }

    private String review;

    public String getReview()
    {
        return review;
    }

    public void setReview(String review)
    {
        this.review = review;
    }


}
