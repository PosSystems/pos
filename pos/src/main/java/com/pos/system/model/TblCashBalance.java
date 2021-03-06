package com.pos.system.model;
// Generated Nov 30, 2016 5:14:00 PM by Hibernate Tools 5.2.0.Beta1

import java.util.Date;

/**
 * TblCashBalance generated by hbm2java
 */
public class TblCashBalance implements java.io.Serializable {

	private Integer intId;
	private TblEmployee tblEmployee;
	private Date datDate;
	private float fltAmount;

	public TblCashBalance() {
	}

	public TblCashBalance(TblEmployee tblEmployee, Date datDate, float fltAmount) {
		this.tblEmployee = tblEmployee;
		this.datDate = datDate;
		this.fltAmount = fltAmount;
	}

	public Integer getIntId() {
		return this.intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public TblEmployee getTblEmployee() {
		return this.tblEmployee;
	}

	public void setTblEmployee(TblEmployee tblEmployee) {
		this.tblEmployee = tblEmployee;
	}

	public Date getDatDate() {
		return this.datDate;
	}

	public void setDatDate(Date datDate) {
		this.datDate = datDate;
	}

	public float getFltAmount() {
		return this.fltAmount;
	}

	public void setFltAmount(float fltAmount) {
		this.fltAmount = fltAmount;
	}

}
