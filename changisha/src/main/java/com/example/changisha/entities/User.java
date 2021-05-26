package com.example.changisha.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String gender;
    private int age;
    private int phoneNo;
    private String location;
    public User(int id,String fname,String lname,String gender,int age,int phoneNo,String location){
        super();
        this.id=id;
        this.age=age;
        this.fname=fname;
        this.gender=gender;
        this.lname=lname;
        this.phoneNo=phoneNo;
        this.location=location;
    }

    public User(){
        super();
    }
    public int getUserid(){return id;}
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public String getGender(){return gender;}
    public int getAge(){return age;}
    public int getPhoneNo(){return phoneNo;}
    public String getLocation(){return location;}

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

//    //public void setUserid(int userid) {
//        this.userid = userid;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", location='" + location + '\'' +
                '}';
    }
}
