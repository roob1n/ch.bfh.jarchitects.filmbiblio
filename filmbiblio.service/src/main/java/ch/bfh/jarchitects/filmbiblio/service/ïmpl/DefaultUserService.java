package ch.bfh.jarchitects.filmbiblio.service.ïmpl;


import ch.bfh.jarchitects.filmbiblio.model.Userr;
import ch.bfh.jarchitects.filmbiblio.repository.UserRepository;
import ch.bfh.jarchitects.filmbiblio.service.UserService;
import ch.bfh.jarchitects.filmbiblio.service.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import javax.inject.Inject;
import javax.inject.Named;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * Created by NTHEVJ on 17.01.2017.
 */
@Named
public class DefaultUserService implements UserService
{
    @Inject
    private UserRepository userRepository;

    private final ModelMapper mapper = new ModelMapper();

    public UserDTO create(UserDTO userDTO)
    {
        Userr user = mapper.map(userDTO, Userr.class);
        Userr persistedUser = userRepository.save(user);
        return mapper.map(persistedUser, UserDTO.class);
    }


    public UserDTO read(String userId)
    {
        Userr user = userRepository.findOne(userId);
        if (user == null) return null;
        return mapper.map(user, UserDTO.class);
    }

    public Collection<UserDTO> list()
    {
        Iterable<Userr> users = userRepository.findAll();
        Type listType = new TypeToken<Collection<UserDTO>>()
        {
        }.getType();
        return mapper.map(users, listType);
    }

    public UserDTO update(UserDTO userDTO)
    {
        Userr user = mapper.map(userDTO, Userr.class);
        Userr updatedUser = userRepository.save(user);
        return mapper.map(updatedUser, UserDTO.class);
    }

    public void delete(UserDTO userDTO)
    {
        Userr user = userRepository.findOne(userDTO.getUserid());
        userRepository.delete(user);
    }
}
