package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int businessId;
    private double moneyNeeded;
    private String nameOfBusiness;
    private Date dateOfRegistration;
    private String status;
    private String location;
    private String owner;
    private String purposeOfBusiness;
    private Date endDateOfFundraising;

    

}
