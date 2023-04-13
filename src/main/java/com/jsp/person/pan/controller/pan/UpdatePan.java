package com.jsp.person.pan.controller.pan;

import com.jsp.person.pan.dto.Pan;
import com.jsp.person.pan.service.PanService;

public class UpdatePan {

	public static void main(String[] args) {

		Pan pan = new Pan();
		pan.setPan_no("idk1506kdi");

		PanService panService = new PanService();
		Pan pan2 = panService.updatePan(pan, 5);
		if (pan2 != null)
			System.out.println("Pan Record Updated");
	}

}
