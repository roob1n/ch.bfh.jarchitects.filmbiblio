package ch.bfh.jarchitects.filmbiblio.repository;

import org.h2.engine.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jasmin on 17.11.2016.
 */
public interface DvdRepository extends CrudRepository<User, Long>
{
}
