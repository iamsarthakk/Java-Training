package p1;

public class Emp {
	int eid;
	String ename, ecity;
	double esal;
	public Emp() {
		
	}
	public Emp(int eid, String ename, String ecity, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = ecity;
		this.esal = esal;
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
	public String getecity() {
		return ecity;
	}
	public void setecity(String ecity) {
		this.ecity = ecity;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
}