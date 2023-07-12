package com.mgsoft.APIrelationship.model;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;


}
