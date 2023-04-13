package com.jsp.person.pan.controller.person;

import com.jsp.person.pan.dto.Person;
import com.jsp.person.pan.service.PersonService;

public class GetByIdPerson {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		Person person = personService.getByIdPerson(1);

		System.out.println("Person Id     : " + person.getId());
		System.out.println("Person Name   : " + person.getName());
		System.out.println("Person Email  : " + person.getEmail());
		System.out.println("Person Gender : " + person.getGender());
		System.out.println("Person CNo    : " + person.getCno());
	}
}
