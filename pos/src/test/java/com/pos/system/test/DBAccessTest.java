package com.pos.system.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.pos.system.dao.DBAccess;
import com.pos.system.model.TblEmployee;

public class DBAccessTest {
	private TblEmployee testEmployee;
	private static DBAccess<TblEmployee> employeeDao;

	@BeforeClass
	public static void setUpBeforeClass() {
		employeeDao = new DBAccess<>(TblEmployee.class);
	}

	@Test
	public void testPersist() {
		PrintStream oldSysOut = System.out;
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outStream));
		testEmployee = new TblEmployee();
		testEmployee.setStrGivenName("Max");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(1);
		employeeDao.persist(testEmployee);
		testEmployee.setStrGivenName("Peter");
		testEmployee.setStrSurname("Mustermann");
		testEmployee.setIntId(2);
		employeeDao.persist(testEmployee);
		assertThat(outStream.toString(), containsString("Hibernate: insert into tblEmployee"));
		System.setOut(oldSysOut);
	}

	@Ignore
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		TblEmployee employee = employeeDao.findById(1);
		assertThat(employee.getIntId(), is(1));
		assertThat(employee.getStrGivenName(), is("Max"));
		assertThat(employee.getStrSurname(), is("Mustermann"));
	}

	@Test
	public void testFindByExample() {
		TblEmployee employee = new TblEmployee();
		employee.setStrSurname("Mustermann");
		ArrayList<TblEmployee> exampleEmployees = (ArrayList<TblEmployee>) employeeDao.findByExample(employee);
		for (TblEmployee tblEmployee : exampleEmployees) {
			assertThat(tblEmployee.getStrSurname(), is("Mustermann"));
		}
	}

}
