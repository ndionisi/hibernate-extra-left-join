package com.ndionisi.hibernateleftjoin;

import javax.persistence.*;

@Entity
public class Customer {

    private Long id;
    private Address address;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }


    @ManyToOne
    @JoinTable(
            name = "customer_address_association",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    public Address getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
