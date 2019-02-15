package utils;

import java.util.Date;

public class User {

    private String email;
    private String login;
    private String password;
    private Date created_at;
    private Date updated_at;
    private String fname;
    private String name;
    private String lname;
    private Date birth_date;
    private boolean is_blocked;
    private String auth_key;


    public User(String email, String login,
                String password, Date created_at,
                Date updated_at, String fname, String name,
                String lname, Date birth_date, boolean is_blocked, String auth_key) {

        this.email = email;
        this.login = login;
        this.password = password;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.fname = fname;
        this.name = name;
        this.lname = lname;
        this.birth_date = birth_date;
        this.is_blocked = is_blocked;
        this.auth_key = auth_key;

    }

}
