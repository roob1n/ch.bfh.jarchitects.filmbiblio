package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.Dvd;
import ch.bfh.jarchitects.filmbiblio.model.Rent;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jasmin on 17.11.2016.
 */
public interface RentRepository extends CrudRepository<Rent, Dvd>
{


}
