package com.jsp.person.pan.controller.pan;

import com.jsp.person.pan.dto.Pan;
import com.jsp.person.pan.service.PanService;

public class DeletePan {

	public static void main(String[] args) {

		PanService panService = new PanService();
		Pan pan = panService.deletePan(8);
		if (pan != null)
			System.out.println("Pan Record Deleted");

	}
}
