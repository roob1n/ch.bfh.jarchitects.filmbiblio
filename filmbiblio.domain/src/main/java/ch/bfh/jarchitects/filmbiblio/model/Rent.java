package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Rent
{
    private String lent_date;

    @Basic
    public String getLent_date()
    {
        return lent_date;
    }

    public void setLent_date(String lentdate)
    {
        this.lent_date = lentdate;
    }

    private User tenant;

    @ManyToOne
    public User getTenant()
    {
        return tenant;
    }

    public void setTenant(User tenant)
    {
        this.tenant = tenant;
    }

    private Dvd dvd;

    @OneToOne
    public Dvd getDvd()
    {
        return dvd;
    }

    public void setDvd(Dvd dvd)
    {
        this.dvd = dvd;
    }
}
