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
	// private Count _count;

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
		// _count = new Count();
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
		// _count.addCount();
		addCount();
		// _cashCheckDifference = Math.round(100 * (_count.getSum() -
		// _dayTotal)) / 100.0;
		_cashCheckDifference = Math.round(100 * (getSum() - _dayTotal)) / 100.0;
	}

	public void resetCounts() {
		// _count = new Count();
		resetCount();
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

	/*
	 * public Count getCount() { return _count; }
	 * 
	 * public void setCount(Count _count) { this._count = _count; }
	 */

	private int _c500;
	private int _c200;
	private int _c100;
	private int _c50;
	private int _c20;
	private int _c10;
	private int _c5;
	private int _c2;
	private int _c1;
	private int _c05;
	private int _c02;
	private int _c01;
	private int _c005;
	private int _c002;
	private int _c001;
	private double _sum;

	public void resetCount() {
		_c500 = 0;
		_c200 = 0;
		_c100 = 0;
		_c50 = 0;
		_c20 = 0;
		_c10 = 0;
		_c5 = 0;
		_c2 = 0;
		_c1 = 0;
		_c05 = 0;
		_c02 = 0;
		_c01 = 0;
		_c005 = 0;
		_c002 = 0;
		_c001 = 0;
		_sum = 0;
	}

	public void addCount() {
		_sum += _c500 * 500;
		_sum += _c200 * 200;
		_sum += _c100 * 100;
		_sum += _c50 * 50;
		_sum += _c20 * 20;
		_sum += _c10 * 10;
		_sum += _c5 * 5;
		_sum += _c2 * 2;
		_sum += _c1 * 1;
		_sum += _c05 * 0.5;
		_sum += _c02 * 0.2;
		_sum += _c01 * 0.1;
		_sum += _c005 * 0.05;
		_sum += _c002 * 0.02;
		_sum += _c001 * 0.01;
	}

	public int getC500() {
		return _c500;
	}

	public void setC500(int _c500) {
		this._c500 = _c500;
	}

	public int getC200() {
		return _c200;
	}

	public void setC200(int _c200) {
		this._c200 = _c200;
	}

	public int getC100() {
		return _c100;
	}

	public void setC100(int _c100) {
		this._c100 = _c100;
	}

	public int getC50() {
		return _c50;
	}

	public void setC50(int _c50) {
		this._c50 = _c50;
	}

	public int getC20() {
		return _c20;
	}

	public void setC20(int _c20) {
		this._c20 = _c20;
	}

	public int getC10() {
		return _c10;
	}

	public void setC10(int _c10) {
		this._c10 = _c10;
	}

	public int getC5() {
		return _c5;
	}

	public void setC5(int _c5) {
		this._c5 = _c5;
	}

	public int getC2() {
		return _c2;
	}

	public void setC2(int _c2) {
		this._c2 = _c2;
	}

	public int getC1() {
		return _c1;
	}

	public void setC1(int _c1) {
		this._c1 = _c1;
	}

	public int getC05() {
		return _c05;
	}

	public void setC05(int _c05) {
		this._c05 = _c05;
	}

	public int getC02() {
		return _c02;
	}

	public void setC02(int _c02) {
		this._c02 = _c02;
	}

	public int getC01() {
		return _c01;
	}

	public void setC01(int _c01) {
		this._c01 = _c01;
	}

	public int getC005() {
		return _c005;
	}

	public void setC005(int _c005) {
		this._c005 = _c005;
	}

	public int getC002() {
		return _c002;
	}

	public void setC002(int _c002) {
		this._c002 = _c002;
	}

	public int getC001() {
		return _c001;
	}

	public void setC001(int _c001) {
		this._c001 = _c001;
	}

	public double getSum() {
		return _sum;
	}

	public void setSum(double _sum) {
		this._sum = _sum;
	}
}

