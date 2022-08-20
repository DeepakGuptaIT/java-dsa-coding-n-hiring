package com.firealgo.javabasicconcept.vo;

import java.time.LocalDateTime;

public class Dept extends BaseEntity {

	private String name;

	public Dept() {
		super();
	}

	public Dept(String name, long id, Boolean active, LocalDateTime createdAt, Long createdBy) {
		super(id, active, createdAt, createdBy);
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass())
			return false;
		Dept other = (Dept) obj;
		if (this.id == other.id)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return name.length();
	}

	@Override
	public String toString() {
		return "{id: " + id + ", deptName: " + name +"}";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
