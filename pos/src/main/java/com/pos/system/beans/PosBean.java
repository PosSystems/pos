package com.pos.system.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PosBean {
	private List<Employee> _employees;
	private List<ProductGroup> _productGroups;
	private Employee _cashier;
	private int _selectedQuantity;
	private ProductGroup _selectedProductGroupObject;
	private int _selectedProductGroupId;
	private List<Article> _articles;
	private double _selectedPrice;
	private double _drawback;
	private double _lumpSumPrice;
	private double _given;
	private double _dayTotal;
	private double _cashCheckDifference;
	private double _cashCheckCount;
	private double _openingAmount;
	private boolean _openingEntryDone;
	private Count _count;

	@PostConstruct
	public void init() {
		_employees = new ArrayList<Employee>();
		_employees.add(new Employee(0, ""));
		_employees.add(new Employee(1, "Sven"));
		_employees.add(new Employee(2, "Dominik"));
		_employees.add(new Employee(3, "Sandra"));
		_productGroups = new ArrayList<ProductGroup>();
		_productGroups.add(new ProductGroup(1, "Bridgekameras"));
		_productGroups.add(new ProductGroup(2, "Taschen"));
		_productGroups.add(new ProductGroup(3, "Speicherkarten"));
		_productGroups.add(new ProductGroup(4, "Camcorder"));
		_productGroups.add(new ProductGroup(5, "Digitalkameras"));
		_productGroups.add(new ProductGroup(6, "SLR-Kameras"));

		_selectedQuantity = 1;
		_articles = new ArrayList<Article>();
		_dayTotal = 0;
		_openingEntryDone = false;
		_count = new Count();
	}

	public void addArticle() {
		_articles.add(new Article(_selectedQuantity, _selectedProductGroupObject, _selectedPrice));
		_selectedQuantity = 1;
		_selectedPrice = 0;
	}

	public void calculateLumpSumPrice() {
		_lumpSumPrice = 0;

		for (Article a : _articles) {
			_lumpSumPrice += a.getQuantity() * a.getPrice();
		}
	}

	public void calculateDrawback() {
		_drawback = Math.round(100 * (_given - _lumpSumPrice)) / 100.0;
	}

	public void reset() {
		_dayTotal += _lumpSumPrice;
		_given = 0;
		_drawback = 0;
		_articles.clear();
	}

	public void finishOpeningEntry() {
		_openingEntryDone = true;
		_dayTotal += _openingAmount;
	}

	public void calculateCashCheckDifference() {
		// _cashCheckDifference = Math.round(100 * (_cashCheckCount -
		// _dayTotal)) / 100.0;
		_count.addCount();
		_cashCheckDifference = Math.round(100 * (_count.getSum() - _dayTotal)) / 100.0;
	}

	public void resetCounts() {
		_count = new Count();
		_cashCheckDifference = 0;
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

	public List<Article> getArticles() {
		return _articles;
	}

	public void setArticles(List<Article> _articles) {
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

	public double getDrawback() {
		return _drawback;
	}

	public void setDrawback(double _drawback) {
		this._drawback = _drawback;
	}

	public double getLumpSumPrice() {
		return _lumpSumPrice;
	}

	public void setLumpSumPrice(double _lumpSumPrice) {
		this._lumpSumPrice = _lumpSumPrice;
	}

	public double getGiven() {
		return _given;
	}

	public void setGiven(double _given) {
		this._given = _given;
	}

	public double getDayTotal() {
		return _dayTotal;
	}

	public void setDayTotal(double _dayTotal) {
		this._dayTotal = _dayTotal;
	}

	public double getCashCheckDifference() {
		return _cashCheckDifference;
	}

	public void setCashCheckDifference(double _cashCheckDifference) {
		this._cashCheckDifference = _cashCheckDifference;
	}

	public double getCashCheckCount() {
		return _cashCheckCount;
	}

	public void setCashCheckCount(double _cashCheckCount) {
		this._cashCheckCount = _cashCheckCount;
	}

	public double getOpeningAmount() {
		return _openingAmount;
	}

	public void setOpeningAmount(double _openingAmount) {
		this._openingAmount = _openingAmount;
	}

	public boolean isOpeningEntryDone() {
		return _openingEntryDone;
	}

	public void setOpeningEntryDone(boolean _openingEntryDone) {
		this._openingEntryDone = _openingEntryDone;
	}

	public Count getCount() {
		return _count;
	}

	public void setCount(Count _count) {
		this._count = _count;
	}

}

