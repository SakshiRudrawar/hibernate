package com.model;

public class Employee {
	
	private int eid;
	private String ename;
	private String edesignation;
	private double esalary;
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", esalary=" + esalary
				+ "]";
	}
	
	

}
