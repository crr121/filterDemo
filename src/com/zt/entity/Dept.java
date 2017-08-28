package com.zt.entity;

import java.io.Serializable;

public class Dept implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer deptNo;
	private String dname;
	private String loc;

	public Dept(Integer deptNo, String dname, String loc) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.loc = loc;
	}

	public Dept() {
		super();
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc
				+ "]";
	}

}
