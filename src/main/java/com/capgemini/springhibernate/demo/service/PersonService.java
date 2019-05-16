package com.capgemini.springhibernate.demo.service;

import com.capgemini.springhibernate.demo.entity.Person;

public interface PersonService {
	public void addPerson(Person person);
	public Person getPersonById(int id);
}
