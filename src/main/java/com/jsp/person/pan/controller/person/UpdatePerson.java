package com.jsp.person.pan.controller.person;

import com.jsp.person.pan.dto.Person;
import com.jsp.person.pan.service.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("IDK");
		person.setEmail("idk@mail.com");
		person.setGender("Female");
		person.setCno(1122334455L);

		PersonService personService = new PersonService();
		Person person2 = personService.updatePerson(person, 5);
		if (person2 != null)
			System.out.println("Record Updated");
	}
}
