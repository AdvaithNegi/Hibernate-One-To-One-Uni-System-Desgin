package com.jsp.person.pan.service;

import com.jsp.person.pan.dao.PersonDao;
import com.jsp.person.pan.dto.Person;

public class PersonService {

	PersonDao personDao = new PersonDao();

	// Save Person
	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}

	// Get By Id Person
	public Person getByIdPerson(int id) {
		return personDao.getByIdPerson(id);
	}

	// Update Person
	public Person updatePerson(Person person, int id) {

		Person person2 = personDao.getByIdPerson(id);
		if (person.getName() != null)
			person2.setName(person.getName());
		if (person.getEmail() != null)
			person2.setEmail(person.getEmail());
		if (person.getGender() != null)
			person2.setGender(person.getGender());
		if (person.getCno() != 0)
			person2.setCno(person.getCno());
		if (person2 != null)
			return personDao.updatePerson(person2);
		return null;
	}

	// Delete Person
	public Person deletePerson(int id) {
		Person person = personDao.getByIdPerson(id);
		if (person != null)
			return personDao.deletePerson(person);
		return null;
	}

	// Get All Persons
	public void getAllPersons() {
		personDao.getAllPersons();
	}

}
