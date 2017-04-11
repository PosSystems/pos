package com.pos.system.test;

import com.pos.system.dao.TblEmployee;
import com.pos.system.dao.TblEmployeeHome;

public class DBAccessTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblEmployee testEmployee = new TblEmployee();
		TblEmployeeHome employeeDao = new TblEmployeeHome();

		testEmployee.setStrGivenName("Max");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(42);

		employeeDao.persist(testEmployee);
		TblEmployee geTblEmployee = employeeDao.findById(42);
		if (geTblEmployee != null) {
			System.out.println(geTblEmployee.getStrSurname());
		} else {
			System.out.println("du bist doof");
		}
	}

}
