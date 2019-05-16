package com.capgemini.springhibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int PersonId;
	private String PersonName;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName) {
		super();
		PersonId = personId;
		PersonName = personName;
	}
	
	public int getPersonId() {
		return PersonId;
	}

	public void setPersonId(int personId) {
		PersonId = personId;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", PersonName=" + PersonName + "]";
	}
	
	
}
