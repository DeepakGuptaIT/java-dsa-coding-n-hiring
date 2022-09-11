package com.firelago.vo;

import java.time.LocalDateTime;

import com.firelago.Constants.Gender;

public class Person extends BaseEntity {

	private String firstName;
	private String lastName;
	private Gender gender;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	
	public Person(String firstName, String lastName, Gender gender, long id, Boolean active) {
		super(id, active);
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public Person(String firstName, String lastName, Gender gender, long id, Boolean active, LocalDateTime createdAt,
			Long createdBy) {
		super(id, active, createdAt, createdBy);
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person otherPerson = (Person) obj;
			return this.getFirstName().equals(otherPerson.getFirstName());
		}

		return false;
	}

	@Override
	public int hashCode() {
		return this.getFirstName().length();
	}

}
