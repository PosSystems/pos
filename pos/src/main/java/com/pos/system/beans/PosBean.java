package com.pos.system.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pos.system.dao.DBAccess;
import com.pos.system.model.TblEmployee;
import com.pos.system.model.TblProductGroup;
import com.pos.system.model.TblVat;

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
	private DBAccess<TblEmployee> _employeeDao;
	private DBAccess<TblProductGroup> _productGroupDao;
	private DBAccess<TblVat> _vatDao;

	@PostConstruct
	public void init() {
		// fill_in_memory_db();

		_employees = new ArrayList<Employee>();
		_productGroups = new ArrayList<ProductGroup>();

		_employees.add(new Employee(0, ""));
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
		_articles = new ArrayList<Article>();
		_dayTotal = 0;
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

	public void calculateCashCheckDifference() {
		_cashCheckDifference = Math.round(100 * (_cashCheckCount - _dayTotal)) / 100.0;
	}

	public void fill_in_memory_db() {
		TblEmployee newEmployee = new TblEmployee();
		_employeeDao = new DBAccess<>(TblEmployee.class);

		newEmployee.setStrGivenName("");
		newEmployee.setStrSurname("");
		newEmployee.setIntId(0);
		_employeeDao.persist(newEmployee);

		newEmployee.setStrGivenName("Sven");
		newEmployee.setStrSurname("Baumann");
		newEmployee.setIntId(1);
		_employeeDao.persist(newEmployee);

		newEmployee.setStrGivenName("Sandra");
		newEmployee.setStrSurname("Kramlich");
		newEmployee.setIntId(2);
		_employeeDao.persist(newEmployee);

		newEmployee.setStrGivenName("Dominik");
		newEmployee.setStrSurname("Schneider");
		newEmployee.setIntId(3);
		_employeeDao.persist(newEmployee);

		TblVat newVat = new TblVat();
		_vatDao = new DBAccess<>(TblVat.class);

		newVat.setIntId(1);
		newVat.setFltVt(7);
		_vatDao.persist(newVat);

		newVat.setIntId(2);
		newVat.setFltVt(19);
		_vatDao.persist(newVat);

		TblProductGroup newProductGroup = new TblProductGroup();
		_productGroupDao = new DBAccess<>(TblProductGroup.class);

		newProductGroup.setIntId(1);
		newProductGroup.setTblVat(_vatDao.findById(1));
		newProductGroup.setStName("Bridgekameras");
		newProductGroup.setFltProfitMargin(0);
		_productGroupDao.persist(newProductGroup);

		newProductGroup.setIntId(2);
		newProductGroup.setTblVat(_vatDao.findById(1));
		newProductGroup.setStName("Taschen");
		newProductGroup.setFltProfitMargin(0);
		_productGroupDao.persist(newProductGroup);

		newProductGroup.setIntId(3);
		newProductGroup.setTblVat(_vatDao.findById(1));
		newProductGroup.setStName("Speicherkarten");
		newProductGroup.setFltProfitMargin(0);
		_productGroupDao.persist(newProductGroup);

		newProductGroup.setIntId(4);
		newProductGroup.setTblVat(_vatDao.findById(2));
		newProductGroup.setStName("Camcorder");
		newProductGroup.setFltProfitMargin(0);
		_productGroupDao.persist(newProductGroup);

		newProductGroup.setIntId(5);
		newProductGroup.setTblVat(_vatDao.findById(2));
		newProductGroup.setStName("Digitlcameras");
		newProductGroup.setFltProfitMargin(0);
		_productGroupDao.persist(newProductGroup);

		newProductGroup.setIntId(6);
		newProductGroup.setTblVat(_vatDao.findById(2));
		newProductGroup.setStName("SLR-Kameras");
		newProductGroup.setFltProfitMargin(0);
		_productGroupDao.persist(newProductGroup);
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
}

