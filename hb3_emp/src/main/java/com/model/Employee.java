package com.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int eid;
    @Column(name="emp_name")
    private String ename;
    @Column(name="emp_company")
    @Transient
    private String ecompany;
    @Column(name="emp_designation")
    private String edesignation;
    @Column(name="emp_salary")
    private double esalary;
    @Embedded
    private Address address;
    
    public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEcompany() {
        return ecompany;
    }

    public void setEcompany(String ecompany) {
        this.ecompany = ecompany;
    }

    public String getEdesignation() {
        return edesignation;
    }

    public void setEdesignation(String edesignation) {
        this.edesignation = edesignation;
    }

    public double getEsalary() {
        return esalary;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    @Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", ecompany=" + ecompany + ", edesignation=" + edesignation
				+ ", esalary=" + esalary + ", address=" + address + "]";
	}

		
}

