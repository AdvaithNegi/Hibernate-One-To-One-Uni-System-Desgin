package com.jsp.person.pan.controller.pan;

import com.jsp.person.pan.dto.Pan;
import com.jsp.person.pan.service.PanService;

public class GetByIdPan {

	public static void main(String[] args) {

		PanService panService = new PanService();
		Pan pan = panService.getByIdPan(1);

		System.out.println("Pan ID     : " + pan.getId());
		System.out.println("Pan Pan_no : " + pan.getPan_no());
		System.out.println("Pan Person : " + pan.getPerson());

	}

}
