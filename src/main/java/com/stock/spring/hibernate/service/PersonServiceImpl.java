package com.stock.spring.hibernate.service;

import java.util.List;

import com.stock.spring.hibernate.dao.PersonDAO;
import com.stock.spring.hibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDao;
	
	public List<Person> getAllPersons() {
		List<Person> persons = personDao.getAllPersons();
		return persons;
	}

	public void insertPerson(Person person) {
		personDao.insertPerson(person);
	}

}
