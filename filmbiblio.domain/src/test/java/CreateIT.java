/**
 *
 */

import ch.bfh.jarchitects.filmbiblio.model.Dvd;
import ch.bfh.jarchitects.filmbiblio.model.Userr;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;

/**
 * @user rovi
 */
public class CreateIT
{

    @Test
    public void test()
    {
        Userr user = new Userr();
        user.setUserid("User1");
        user.setEmail("test@hotmail.com");

        Dvd dvd = new Dvd();
        Dvd dvd2 = new Dvd();

        ArrayList<Dvd> dvds = new ArrayList<Dvd>();
        dvds.add(dvd);
        dvds.add(dvd2);
        user.setDvds(dvds);
        dvd.setOwner(user);
        dvd2.setOwner(user);

        EntityManager em = Persistence.createEntityManagerFactory(
                "ch.bfh.jarchitects.filmbiblio.domain").createEntityManager();


        //Transaction get collected
        em.getTransaction().begin();
        em.persist(user);
        //Collected transactions get executed
        //If an error shows up - the perviouse transactions get rollbacked (rückgängig gemacht)
        em.getTransaction().commit();
    }
}
