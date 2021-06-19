package com.stock.spring.hibernate.service;

import java.util.List;

import com.stock.spring.hibernate.model.Person;

public interface PersonService {

	public List<Person> getAllPersons();
	
	public void insertPerson(Person person);
}
