package model;

/**
 * Created by Marc on 31.10.2016.
 */
public class User {
    private String email;
    private String name;
    private String password;

    public User( String email, String name, String password ) {
        this.email = email;
        this.name = name;
        this.password = password;

    }

    public User( String email, String password ) {
        this( email, email, password );

    }

    public String getEmail() {
        return this.email;

    }

    public boolean setEmail( String email, String password ) {
        if ( this.password.equals( password ) ) {
            this.email = email;
            return true;
        }
        return false;

    }

    public String getName() {
        return this.name;

    }

    public void setName( String name ) {
        this.name = name;

    }

    public boolean setPassword( String oldPassword, String newPassword ) {
        if ( this.password.equals( oldPassword ) ) {
            this.password = newPassword;
            return true;
        }

        return false;

    }

}
