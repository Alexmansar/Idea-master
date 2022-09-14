package com.alexmansar.homework.lesson16.library.model;

public class Author {
    private String name;

    private String surname;

    public String getSurname() {
        return surname;
    }

    public Author() {
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author " + name + " " + surname;
    }
}