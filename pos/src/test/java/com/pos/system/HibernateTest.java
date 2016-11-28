package com.pos.system;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pos.system.dao.EmployeeDAO;
import com.pos.system.model.Employee;

public class HibernateTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeDAO personDAO = context.getBean(EmployeeDAO.class);

		Employee employee = new Employee();
		employee.setIntId(13);
		employee.setBitManagementArea(true);
		employee.setStrSurname("Doe");
		employee.setStrGivenName("John");

		personDAO.save(employee);

		System.out.println("Employee::" + employee);

		List<Employee> list = personDAO.list();

		for (Employee p : list) {
			System.out.println("Employee List::" + p);
		}
		// close resources
		context.close();
	}

}
