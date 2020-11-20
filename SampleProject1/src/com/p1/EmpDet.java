package com.p1;

import java.io.Serializable;

public class EmpDet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int eid;
	String ename;
	public EmpDet() {
		
	}
	public EmpDet(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
