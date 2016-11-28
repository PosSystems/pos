package com.pos.system.model;

public class Employee {
	private int intId;
	private String strGivenName;
	private String strSurname;
	private String strStreet;
	private int intPostCode;
	private String strCity;
	private String strPassword;
	private boolean bitManagementArea;

	public int getIntId() {
		return intId;
	}

	public void setIntId(int intId) {
		this.intId = intId;
	}

	public String getStrGivenName() {
		return strGivenName;
	}

	public void setStrGivenName(String strGivenName) {
		this.strGivenName = strGivenName;
	}

	public String getStrSurname() {
		return strSurname;
	}

	public void setStrSurname(String strSurname) {
		this.strSurname = strSurname;
	}

	public String getStrStreet() {
		return strStreet;
	}

	public void setStrStreet(String strStreet) {
		this.strStreet = strStreet;
	}

	public int getIntPostCode() {
		return intPostCode;
	}

	public void setIntPostCode(int intPostCode) {
		this.intPostCode = intPostCode;
	}

	public String getStrCity() {
		return strCity;
	}

	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public boolean isBitManagementArea() {
		return bitManagementArea;
	}

	public void setBitManagementArea(boolean bitManagementArea) {
		this.bitManagementArea = bitManagementArea;
	}

}
