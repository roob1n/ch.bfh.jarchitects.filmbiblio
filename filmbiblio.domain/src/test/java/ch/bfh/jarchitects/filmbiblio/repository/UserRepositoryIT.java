package ch.bfh.jarchitects.filmbiblio.repository;


import ch.bfh.jarchitects.filmbiblio.model.Userr;
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
        Userr newUser = new Userr();
        newUser.setUserid("Test");
        userRepository.save(newUser);

// Read
        Userr readUser = userRepository.findOne(newUser.getUserid());
        org.junit.Assert.assertTrue(newUser.getUserid().equals(readUser.getUserid()));
// Update
        readUser.setEmail("Test2");
        readUser = userRepository.save(readUser);
        Userr updatedUser = userRepository.findOne(readUser.getUserid());
        org.junit.Assert.assertTrue(readUser.getUserid().equals(updatedUser.getUserid()));
// Delete
        userRepository.delete(updatedUser);
        Userr deletedUser = userRepository.findOne(readUser.getUserid());
        org.junit.Assert.assertNull(deletedUser);
    }


}
