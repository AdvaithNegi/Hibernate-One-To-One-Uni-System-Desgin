package com.jsp.person.pan.service;

import com.jsp.person.pan.dao.PanDao;
import com.jsp.person.pan.dto.Pan;

public class PanService {

	PanDao panDao = new PanDao();

	// Save Pan
	public Pan savePan(Pan pan) {
		return panDao.savePan(pan);
	}

	// Get By Id Pan
	public Pan getByIdPan(int id) {
		return panDao.getByIdPan(id);
	}

	// Update Pan
	public Pan updatePan(Pan pan, int id) {
		Pan pan2 = panDao.getByIdPan(id);
		if (pan.getPan_no() != null)
			pan2.setPan_no(pan.getPan_no());
		if (pan2 != null)
			return panDao.updatePan(pan2);
		return null;
	}

	// Delete Pan
	public Pan deletePan(int id) {
		Pan pan = panDao.getByIdPan(id);
		if (pan != null)
			return panDao.deletePan(pan);
		return null;
	}

	// Get All Pans
	public void getAllPans() {
		panDao.getAllPans();
	}

}
