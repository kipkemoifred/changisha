package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MobileMoneyPlatforms {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String location;
    private String payment;
}
