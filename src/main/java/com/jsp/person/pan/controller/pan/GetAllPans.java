package com.jsp.person.pan.controller.pan;

import com.jsp.person.pan.service.PanService;

public class GetAllPans {

	public static void main(String[] args) {

		PanService panService = new PanService();
		panService.getAllPans();

	}

}
