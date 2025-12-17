package com.example.demo.entity;

import jakarta.persistence.*;

public class Student{
    @Id
    private int id;
    private String sname;
    private String semail;
    private float cgpa;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public String getSemail(){
        return semail;
    }
    public void setSemail(String semail){
        this.semail=semail;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(float id){
        this.cgpa=cgpa;
    }
    public Student(int id, String sname, String semail, float cgpa) {
        this.id = id;
        this.sname = sname;
        this.semail = semail;
        this.cgpa = cgpa;
    }
     public Student() {
    }
    
}