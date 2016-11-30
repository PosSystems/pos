package com.pos.system.beans;


public class ProductGroup {
	private int _id;
	private String _name;

	public ProductGroup() {

	}

	public ProductGroup(int id, String name) {
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
}

