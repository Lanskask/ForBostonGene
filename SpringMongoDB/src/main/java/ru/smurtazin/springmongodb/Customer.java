package ru.smurtazin.springmongodb;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by a1 on 14.03.17.
 */
public class Customer {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Date birthday;
    public String email;
    public String password;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}