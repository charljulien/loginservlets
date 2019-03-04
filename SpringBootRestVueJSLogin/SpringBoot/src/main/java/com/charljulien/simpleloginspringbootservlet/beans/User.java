package com.charljulien.simpleloginspringbootservlet.beans;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "errorLogin")
    private Boolean errorLogin;

    public User() {
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getErrorLogin() {
        return errorLogin;
    }
    public void setErrorLogin(Boolean errorLogin) {
        this.errorLogin = errorLogin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id = " + id +
                ", username = '" + username + '\'' +
                ", password = '" + password + '\'' +
                ", errorLogin = " + errorLogin +
                '}';
    }
}
