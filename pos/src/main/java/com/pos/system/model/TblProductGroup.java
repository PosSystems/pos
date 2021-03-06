package com.pos.system.model;
// Generated Nov 30, 2016 5:14:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * TblProductGroup generated by hbm2java
 */
public class TblProductGroup implements java.io.Serializable {

	private int intId;
	private TblVat tblVat;
	private String stName;
	private float fltProfitMargin;

	public TblProductGroup() {
	}

	public TblProductGroup(int intId, TblVat tblVat, String stName, float fltProfitMargin) {
		this.intId = intId;
		this.tblVat = tblVat;
		this.stName = stName;
		this.fltProfitMargin = fltProfitMargin;
	}

	public int getIntId() {
		return this.intId;
	}

	public void setIntId(int intId) {
		this.intId = intId;
	}

	public TblVat getTblVat() {
		return this.tblVat;
	}

	public void setTblVat(TblVat tblVat) {
		this.tblVat = tblVat;
	}

	public String getStName() {
		return this.stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public float getFltProfitMargin() {
		return this.fltProfitMargin;
	}

	public void setFltProfitMargin(float fltProfitMargin) {
		this.fltProfitMargin = fltProfitMargin;
	}

}
