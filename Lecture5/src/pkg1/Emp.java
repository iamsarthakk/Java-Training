package pkg1;

public class Emp {
	int empid;
	String ename;
	public Emp() {
		
	}
	public Emp(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
