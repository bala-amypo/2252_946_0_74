package com.example.demo.entity;

import jakarta.persistence.*;

public class Student{
    @Id
    private long id;
    private String sname;
    private String semail;
    private float cgpa;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getSname(){
        return sname;
    }
    public void setSname(long sname){
        this.sname=sname;
    }
    public String getSemail(){
        return semail;
    }
    public void setSemail(long semail){
        this.semail=semail;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setCgpa(long id){
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