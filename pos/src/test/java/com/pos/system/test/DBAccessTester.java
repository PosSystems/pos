package com.pos.system.test;

import com.pos.system.dao.TblEmployeeHome;
import com.pos.system.model.TblEmployee;

public class DBAccessTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblEmployee testEmployee = new TblEmployee();
		TblEmployeeHome employeeDao = new TblEmployeeHome();

		testEmployee.setStrGivenName("Max");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(42);

		employeeDao.persist(testEmployee);
		employeeDao.findById(42);
	}

}
