package com.stock.spring.hibernate.dao;

import java.util.List;

import com.stock.spring.hibernate.model.Person;

public interface PersonDAO {

	public List<Person> getAllPersons();
	
	public void insertPerson (Person person);
}
