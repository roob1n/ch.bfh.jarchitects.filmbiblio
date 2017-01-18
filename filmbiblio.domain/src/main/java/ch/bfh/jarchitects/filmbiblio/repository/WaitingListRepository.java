package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.WaitingList;
import ch.bfh.jarchitects.filmbiblio.model.specialkeys.UserMovieKey;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jasmin on 17.11.2016.
 */
public interface WaitingListRepository
        extends CrudRepository<WaitingList, UserMovieKey>
{


}
