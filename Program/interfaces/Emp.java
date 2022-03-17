package com.te.learn.abstraction.interfaces;

public class Emp implements comparator {
	private int eId;
	private String eName;
	private int eAge;
	private double eSalary;
	
	
	public Emp(int eId, String eName, int eAge, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public Emp() {
		super();
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + "]";
	}
	
}
