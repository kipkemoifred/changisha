package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double moneyPaid;
    private String fName;
    private String lName;
    private String phoneNo;
    private String email;
    private String gender;

}
