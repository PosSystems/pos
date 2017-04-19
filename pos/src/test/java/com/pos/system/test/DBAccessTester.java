package com.pos.system.test;

import java.util.ArrayList;

import com.pos.system.dao.DBAccess;
import com.pos.system.model.TblEmployee;

public class DBAccessTester {

	public static void main(String[] args) {
		TblEmployee testEmployee = new TblEmployee();
		// TblEmployeeHome employeeDao = new TblEmployeeHome();
		DBAccess<TblEmployee> employeeDao = new DBAccess<>(TblEmployee.class);

		testEmployee.setStrGivenName("Max");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(1);
		employeeDao.persist(testEmployee);

		testEmployee.setStrGivenName("Hans");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(2);
		employeeDao.persist(testEmployee);

		testEmployee.setStrGivenName("Peter");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(3);
		employeeDao.persist(testEmployee);

		System.out.println("Find by ID");
		TblEmployee geTblEmployee = employeeDao.findById(42);
		if (geTblEmployee != null) {
			System.out.println(geTblEmployee.getStrSurname());
		} else {
			System.out.println("du bist doof");
		}

		System.out.println("\nFind by example");
		TblEmployee exampleEmployee = new TblEmployee();
		// exampleEmployee.setStrGivenName("Hans");
		exampleEmployee.setStrSurname("Mustermann");
		// employeeDao.persist(exampleEmployee);

		ArrayList<TblEmployee> exampleEmployees = (ArrayList<TblEmployee>) employeeDao.findByExample(exampleEmployee);
		for (TblEmployee tblEmployee : exampleEmployees) {
			System.out.println(tblEmployee.getStrGivenName() + ' ' + tblEmployee.getStrSurname());
		}

	}

}
