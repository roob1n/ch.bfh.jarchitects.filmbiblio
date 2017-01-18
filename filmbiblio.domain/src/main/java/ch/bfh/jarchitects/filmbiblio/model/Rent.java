package ch.bfh.jarchitects.filmbiblio.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jasmin on 03.11.2016.
 */
@Entity
public class Rent
{
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

    private Userr tenant;

    @ManyToOne
    public Userr getTenant()
    {
        return tenant;
    }

    public void setTenant(Userr tenant)
    {
        this.tenant = tenant;
    }


}
