package org.launchcode.spaday.models;

import java.util.Date;
import java.util.Objects;

public class User {
    private String username;
    private String email;
    private String password;
    private Date date;

    private int id;
    private static int nextId = 1;

    public User(String username, String email, String password, Date date) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.date = date;
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
