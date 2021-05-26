package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int companyId;
    private String name;
    private String ownership;

}
