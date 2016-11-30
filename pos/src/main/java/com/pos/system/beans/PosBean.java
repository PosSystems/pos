package com.pos.system.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PosBean {
	private List<Employee> _employees;
	private List<ProductGroup> _productGroups;
	private Employee _cashier;
	private int _selectedQuantity;
	private ProductGroup _selectedProductGroupObject;
	private int _selectedProductGroupId;
	private List<String> _articles;
	private double _selectedPrice;

	@PostConstruct
	public void init() {
		_employees = new ArrayList<Employee>();
		_productGroups = new ArrayList<ProductGroup>();

		_employees.add(new Employee(1, "Sven"));
		_employees.add(new Employee(2, "Dominik"));
		_employees.add(new Employee(3, "Sandra"));
		_productGroups.add(new ProductGroup(1, "Bridgekameras"));
		_productGroups.add(new ProductGroup(2, "Taschen"));
		_productGroups.add(new ProductGroup(3, "Speicherkarten"));
		_productGroups.add(new ProductGroup(4, "Camcorder"));
		_productGroups.add(new ProductGroup(5, "Digitalkameras"));
		_productGroups.add(new ProductGroup(6, "SLR-Kameras"));

		_selectedQuantity = 1;

		_articles = new ArrayList<String>();
		_articles.add("Test");
	}

	public void addArticle() {
		_articles.add(_selectedProductGroupObject.getName() + " " + _selectedPrice);
		_selectedQuantity = 1;
		_selectedPrice = 0;
	}

	public List<Employee> getEmployees() {
		return _employees;
	}

	public void setEmployees(List<Employee> _employees) {
		this._employees = _employees;
	}

	public List<ProductGroup> getProductGroups() {
		return _productGroups;
	}

	public void setProductGroups(List<ProductGroup> _productGroups) {
		this._productGroups = _productGroups;
	}

	public Employee getCashier() {
		return _cashier;
	}

	public void setCashier(Employee _cashier) {
		this._cashier = _cashier;
	}

	public int getSelectedQuantity() {
		return _selectedQuantity;
	}

	public void setSelectedQuantity(int _selectedQuantity) {
		this._selectedQuantity = _selectedQuantity;
	}

	public ProductGroup getSelectedProductGroupObject() {
		return _selectedProductGroupObject;
	}

	public void setSelectedProductGroupObject(ProductGroup _selectedProductGroupObject) {
		this._selectedProductGroupObject = _selectedProductGroupObject;
	}

	public List<String> getArticles() {
		return _articles;
	}

	public void setArticles(List<String> _articles) {
		this._articles = _articles;
	}

	public double getSelectedPrice() {
		return _selectedPrice;
	}

	public void setSelectedPrice(double _selectedPrice) {
		this._selectedPrice = _selectedPrice;
	}

	public int getSelectedProductGroupId() {
		return _selectedProductGroupId;
	}

	public void setSelectedProductGroupId(int _selectedProductGroupId) {
		this._selectedProductGroupId = _selectedProductGroupId;
	}
}

