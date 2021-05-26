package com.example.changisha.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Notification {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private Date time;
    private String type;
    private String description;
    private Date whenRead;

}
