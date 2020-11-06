package p1;

public class Emp {
	int eid;
	String ename, ecity;
	double esal;
	public Emp() {
		
	}
	public Emp(int eid, String ename, String city, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ecity = city;
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
	public String getCity() {
		return ecity;
	}
	public void setCity(String city) {
		this.ecity = city;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + ", esal=" + esal + "]";
	}
}
