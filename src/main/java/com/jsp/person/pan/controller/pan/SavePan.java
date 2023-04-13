package com.jsp.person.pan.controller.pan;

import com.jsp.person.pan.dto.Pan;
import com.jsp.person.pan.dto.Person;
import com.jsp.person.pan.service.PanService;
import com.jsp.person.pan.service.PersonService;

public class SavePan {

	public static void main(String[] args) {

		PersonService personService = new PersonService();
		Person person = personService.getByIdPerson(8);

		Pan pan = new Pan();
		pan.setPan_no("abc1212cba");
		pan.setPerson(person);

		PanService panService = new PanService();
		panService.savePan(pan);

	}
}
