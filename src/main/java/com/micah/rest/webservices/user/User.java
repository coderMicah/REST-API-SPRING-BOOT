package com.micah.rest.webservices.user;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    private LocalDate birthDate;

    public User(int id, String name, LocalDate date) {
        super();
        this.id = id;
        this.name = name;
        this.birthDate = date;
    }

    // Getter for 'id'
    public int getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'birthDate'
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Setter for 'birthDate'
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // toString method
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
