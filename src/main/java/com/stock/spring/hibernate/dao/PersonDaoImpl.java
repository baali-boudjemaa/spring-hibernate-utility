package com.stock.spring.hibernate.dao;

import java.util.List;

import com.stock.spring.hibernate.model.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class PersonDaoImpl implements PersonDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	public List<Person> getAllPersons() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Person";
		Query query = session.createQuery(hql);
		List<Person> persons = query.list();
		return persons;
	}

	@Transactional(readOnly = false)
	public void insertPerson(Person employee) {
		Session session = sessionFactory.openSession();
		session.save(employee);
	}

}
