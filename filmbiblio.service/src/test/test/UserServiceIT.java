import ch.bfh.jarchitects.filmbiblio.service.UserService;
import ch.bfh.jarchitects.filmbiblio.service.dto.UserDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/serviceContext.xml")
public class UserServiceIT
{

    @Inject
    private UserService userService;

    @Test
    public void test()
    {

        // Create
        UserDTO newUser = new UserDTO();
        newUser.setUserid("TestUser");
        newUser = userService.create(newUser);

        // Read
        UserDTO readUser = userService.read(newUser.getUserid());
        Assert.assertTrue(newUser.getUserid().equals(readUser.getUserid()));

        // Update
        readUser.setEmail("TestEmail");
        readUser = userService.update(readUser);
        UserDTO updatedUser = userService.read(readUser.getUserid());
        Assert.assertTrue(readUser.getEmail().equals(updatedUser.getEmail()));

        // Delete
        userService.delete(updatedUser);
        UserDTO deletedUser = userService.read(readUser.getUserid());
        Assert.assertNull(deletedUser);
    }

}
