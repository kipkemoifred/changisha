package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productId;
    private String webAddress;
    private String ussd;

}
