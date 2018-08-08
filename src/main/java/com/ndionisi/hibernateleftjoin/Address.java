package com.ndionisi.hibernateleftjoin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    private Long id;
    private String street;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
