package com.pos.system.beans;

public class Employee {
	private int _id;
	private String _name;

	public Employee() {

	}

	public Employee(int id, String name) {
		_id = id;
		_name = name;
	}

	public int getId() {
		return _id;
	}

	public void setId(int _id) {
		this._id = _id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		try {
			if (this._id != employee._id) {
				return false;
			}
			if (this._name != null && !this._name.equals(employee._name)) {
				return false;
			}
			if (employee._name != null && this._name == null) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employee: _id=" + this._id + " _name=" + this._name;
	}
}
