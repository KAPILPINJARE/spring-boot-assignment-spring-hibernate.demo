package com.capgemini.springhibernate.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springhibernate.demo.entity.Person;
import com.capgemini.springhibernate.demo.service.PersonService;

@RestController
public class DemoController {
	
	@Autowired
	PersonService service;
	
	@RequestMapping("/")
	public Person addPerson() {
		Person person = new Person(104,"kapil");
		service.addPerson(person);;
	    return person;
	}
	
	@RequestMapping("/get")
	public Person getPersonById() {
		return service.getPersonById(104);
	}
}
