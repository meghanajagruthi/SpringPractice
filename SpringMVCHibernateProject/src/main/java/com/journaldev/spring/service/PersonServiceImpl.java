package com.journaldev.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journaldev.spring.bean.Person;
import com.journaldev.spring.dao.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDAO personDAO;

	public void setPerson(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	/*@/*@Override*/
	@Transactional
	public void addPerson(Person p) {
		this.personDAO.addPerson(p);
	}

	/*@/*@Override*/
	@Transactional
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	/*@Override*/
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	/*@Override*/
	@Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	/*@Override*/
	@Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}

}
