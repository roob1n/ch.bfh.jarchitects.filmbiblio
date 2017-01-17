package ch.bfh.jarchitects.filmbiblio.service.dto;

import java.util.Date;

/**
 * Created by Jasmin on 03.11.2016.
 */
public class RentDTO
{
    private DvdDTO dvd;

    public DvdDTO getDvd()
    {
        return dvd;
    }

    public void setDvd(DvdDTO dvd)
    {
        this.dvd = dvd;
    }

    private Date lent_date;

    public Date getLent_date()
    {
        return lent_date;
    }

    public void setLent_date(Date lentdate)
    {
        this.lent_date = lentdate;
    }

    private UserDTO tenant;

    public UserDTO getTenant()
    {
        return tenant;
    }

    public void setTenant(UserDTO tenant)
    {
        this.tenant = tenant;
    }


}
