package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lid;
    private String lname;

    @Column(columnDefinition = "double(10,2)")
    private double lprice;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters and Setters

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getLprice() {
        return lprice;
    }

    public void setLprice(double lprice) {
        this.lprice = lprice;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
    }
}
