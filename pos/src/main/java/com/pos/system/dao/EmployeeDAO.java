package com.pos.system.dao;

import java.util.List;

import com.pos.system.model.Employee;

public interface EmployeeDAO {

	public void save(Employee employee);

	public List<Employee> list();

}
