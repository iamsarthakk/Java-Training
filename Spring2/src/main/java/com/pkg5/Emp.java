package com.pkg5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	

	int eid;
	String ename;
	
	@Autowired
	Address adr;
	
	@Autowired
	Department dept;
	
	Emp(){
		
	}
	public Emp(int eid, String ename) {
		super();
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
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", adr=" + adr + ", dept=" + dept + "]";
	}
	
}
