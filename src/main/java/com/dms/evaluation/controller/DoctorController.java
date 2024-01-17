package com.dms.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.service.DoctorService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("doctorRest/api")
public class DoctorController {
	
	@Autowired
	DoctorService ds;
	
	@PostMapping("/doctor")
	public boolean performInsert(@RequestBody Doctor bean) {
		return ds.addDoctor(bean);
	}

}
