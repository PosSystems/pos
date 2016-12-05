package com.pos.system.beans;

public class Article {
	private int _quantity;
	private ProductGroup _productGroup;
	private double _price;

	public Article() {

	}

	public Article(int quantity, ProductGroup productGroup, double price) {
		_quantity = quantity;
		_productGroup = productGroup;
		_price = price;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int _quantity) {
		this._quantity = _quantity;
	}

	public ProductGroup getProductGroup() {
		return _productGroup;
	}

	public void setProductGroup(ProductGroup _productGroup) {
		this._productGroup = _productGroup;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}
}
