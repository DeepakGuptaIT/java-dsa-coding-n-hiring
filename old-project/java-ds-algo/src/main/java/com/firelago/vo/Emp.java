package com.firelago.vo;

import java.time.LocalDateTime;

import com.firelago.Constants.Gender;

public class Emp extends Person {
	private Dept dept;
	private String fullName;
	private long salary;

	public Emp() {
		super();
	}

	public Emp(Dept dept, String fullName, String firstName, String lastName, Gender gender, long id, Boolean active) {
		super(firstName, lastName, gender, id, active);
		this.dept = dept;
		this.fullName = fullName;
	}

	public Emp(Dept dept, String fullName, long salary, String firstName, String lastName, Gender gender, long id,
			Boolean active, LocalDateTime createdAt, Long createdBy) {
		super(firstName, lastName, gender, id, active, createdAt, createdBy);
		this.dept = dept;
		this.fullName = fullName;
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{id: " + id + ", name: " + this.getFullName() + ", isActive: "+ this.isActive() + ", dept: " + dept + "}\n";
	}

}
