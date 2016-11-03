package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Rent
{
    private Date lent_date;

    @Basic
    @Temporal(TemporalType.DATE)
    public Date getLent_date()
    {
        return lent_date;
    }

    public void setLent_date(Date lentdate)
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

    @OneToOne(cascade = CascadeType.ALL)
    @Id
    public Dvd getDvd()
    {
        return dvd;
    }

    public void setDvd(Dvd dvd)
    {
        this.dvd = dvd;
    }
}
