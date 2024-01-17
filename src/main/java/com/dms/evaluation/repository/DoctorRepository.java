package com.dms.evaluation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dms.evaluation.model.Doctor;

@Repository
public class DoctorRepository {

	List<Doctor> docList=new ArrayList<Doctor>();
	public boolean addDoctor(Doctor bean) {
		docList.add(bean);
		return true;
	}
}
