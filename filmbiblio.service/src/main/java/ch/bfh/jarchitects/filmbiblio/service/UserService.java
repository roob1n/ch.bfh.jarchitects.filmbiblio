package ch.bfh.jarchitects.filmbiblio.service;

import ch.bfh.jarchitects.filmbiblio.service.dto.UserDTO;

import java.util.Collection;

/**
 * Created by Jasmin on 17.11.2016.
 */
public interface UserService
{
    public UserDTO create(UserDTO book);

    public UserDTO read(long id);

    public Collection<UserDTO> list();

    public UserDTO update(UserDTO book);

    public void delete(UserDTO book);
}
