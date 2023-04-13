package com.jsp.person.pan.controller.person;

import com.jsp.person.pan.service.PersonService;

public class GetAllPersons {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		personService.getAllPersons();

	}
}
