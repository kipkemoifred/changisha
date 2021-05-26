package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class BusinessTransaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String purpose;
    private Date endDateOfFundRaising;
    private Date startDate;

}
