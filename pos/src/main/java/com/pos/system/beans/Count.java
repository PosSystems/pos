package com.pos.system.beans;

public class Count {
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

	public Count() {
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
