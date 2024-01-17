package com.dms.evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository dr;
	
	public boolean addDoctor(Doctor bean) {
		dr.addDoctor(bean);
		return true;
	}
}
