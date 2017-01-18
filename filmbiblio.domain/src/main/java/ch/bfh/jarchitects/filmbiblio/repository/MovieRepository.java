package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jasmin on 17.11.2016.
 */
public interface MovieRepository extends CrudRepository<Movie, Long>
{


}
