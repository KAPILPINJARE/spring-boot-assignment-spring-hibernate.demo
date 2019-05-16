package com.capgemini.springhibernate.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springhibernate.demo.dao.PersonDao;
import com.capgemini.springhibernate.demo.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;
	
	@Override
	public void addPerson(Person person) {
		dao.save(person);
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

}
