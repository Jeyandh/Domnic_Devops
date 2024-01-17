package com.dms;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.repository.DoctorRepository;

@SpringBootTest
class SbDoctorCicdApplicationTests {

	@Autowired
	static DoctorRepository dao;
	Doctor bean = new Doctor(101, "Domnic", "12-12-12", "12:30", "Dev", "df");

	@Test
	void contextLoads() {
	}
	
	@Test
    public void testPerformInsert() {
		dao=new DoctorRepository();
		boolean value=dao.addDoctor(bean);
		assertEquals(value, true);
	}
}
