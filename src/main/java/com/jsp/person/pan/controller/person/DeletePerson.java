package com.jsp.person.pan.controller.person;

import com.jsp.person.pan.dto.Person;
import com.jsp.person.pan.service.PanService;
import com.jsp.person.pan.service.PersonService;

public class DeletePerson {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		PanService panService = new PanService();
		panService.deletePan(7);
		Person person = personService.deletePerson(7);
		if (person != null) {
			System.out.println("Person Record Deleted");
		}
	}
}
