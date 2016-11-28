package com.pos.system;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pos.system.dao.EmployeeDAO;
import com.pos.system.model.Employee;

public class HibernateTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

		Employee employee = new Employee();
		employee.setBitManagementArea(true);
		employee.setStrSurname("Doe");
		employee.setStrGivenName("Peter");

		employeeDAO.save(employee);

		System.out.println("Employee::" + employee);

		List<Employee> list = employeeDAO.list();

		for (Employee p : list) {
			System.out.println("Employee List::" + p);
		}
		// close resources
		context.close();
	}

}
