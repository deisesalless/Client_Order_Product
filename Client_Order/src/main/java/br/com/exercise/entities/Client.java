package br.com.exercise.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate birthday;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Client() {
    }

    public Client(String name, String email, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Client {name = " + name + ", email = " + email +
                ", birthday = " + dtf.format(birthday) + "}";
    }
}
