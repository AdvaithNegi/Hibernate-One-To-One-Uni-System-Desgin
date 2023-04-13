package com.jsp.person.pan.controller.person;

import com.jsp.person.pan.dto.Person;
import com.jsp.person.pan.service.PersonService;

public class SavePerson {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("ABC");
		person.setEmail("abc@mail.com");
		person.setCno(7744226699L);
		person.setGender("Female");

		PersonService personService = new PersonService();
		Person person2 = personService.savePerson(person);
		if (person2 != null)
			System.out.println("Person Record Added");
	}
}
