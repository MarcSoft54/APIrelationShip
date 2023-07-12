package com.mgsoft.APIrelationship.model;

import jakarta.persistence.*;

@Entity
public class Librairy {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
