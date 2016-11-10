package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by uahnn on 10.11.16
 */
public interface UserRepository extends CrudRepository<User, String>{
}
