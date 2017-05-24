package com.pos.system.beans;

public class ProductGroup {
	private int _id;
	private String _name;

	public ProductGroup() {
		// just in case
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

	@Override
	public boolean equals(Object obj) {
		try {
			ProductGroup productGroup = (ProductGroup) obj;
			if (this._id != productGroup._id) {
				return false;
			}
			if (this._name != null && !this._name.equals(productGroup._name)) {
				return false;
			}
			if (productGroup._name != null && this._name == null) {
				return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "ProductGroup: _id=" + this._id + " _name=" + this._name;
	}
}
