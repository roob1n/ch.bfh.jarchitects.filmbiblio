package ch.bfh.jarchitects.filmbiblio.repository;

import ch.bfh.jarchitects.filmbiblio.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by Jasmin on 17.11.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/persistenceContext.xml")
public class UserRepositoryIT
{
    @Inject
    private UserRepository userRepository;

    @Test
    public void test()
    {
        // Create
        User newUser = new User();
        newUser.setUserid("Test");
        userRepository.save(newUser);

// Read
        User readUser = userRepository.findOne(newUser.getUserid());
        org.junit.Assert.assertTrue(newUser.getUserid().equals(readUser.getUserid()));
// Update
        readUser.setEmail("Test2");
        readUser = userRepository.save(readUser);
        User updatedUser = userRepository.findOne(readUser.getId());
        org.junit.Assert.assertTrue(readUser.getUserid().equals(updatedUser.getUserid()));
// Delete
        userRepository.delete(updatedUser);
        User deletedUser = userRepository.findOne(readUser.getId());
        org.junit.Assert.assertNull(deletedUser);
    }


}
