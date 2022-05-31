package com.project.Freshers.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.id.IncrementGenerator;

@Table(name = "freshers")
@Entity
//public class Freshers extends Object is the super most object of java ... it will internally extends to the obj class
public class Freshers {
	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc",strategy = "increment")
	private int Id;

	@Column(name = "name")
	private String Name;

	@Column(name = "mobilenumber")
	private long MobileNumber;

	@Column(name = "salary")
	private double Salary;

	@Column(name = "is_trained")
	private boolean Is_trained;

	public Freshers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Freshers(String name, long mobileNumber, double salary, boolean is_trained) {
		super();
		Name = name;
		MobileNumber = mobileNumber;
		Salary = (int) salary;
		Is_trained = is_trained;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = (int) salary;
	}

	public boolean isIs_trained() {
		return Is_trained;
	}

	public void setIs_trained(boolean is_trained) {
		Is_trained = is_trained;
	}

	@Override
	public String toString() {
		return "Freshers [Name=" + Name + ", MobileNumber=" + MobileNumber + ", Salary=" + Salary + ", Is_trained="
				+ Is_trained + "]";
	}
	

	
	}
