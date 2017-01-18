package ch.bfh.jarchitects.filmbiblio.service;

import ch.bfh.jarchitects.filmbiblio.service.dto.UserDTO;

import java.util.Collection;

/**
 * Created by Jasmin on 17.11.2016.
 */
public interface UserService
{
    public UserDTO create(UserDTO user);

    public UserDTO read(String id);

    public Collection<UserDTO> list();

    public UserDTO update(UserDTO user);

    public void delete(UserDTO user);
}
