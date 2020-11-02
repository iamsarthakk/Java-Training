package p2;

public class Emp {
	int empid;
	String ename;
	char egen;
	double esal;
	public Emp() {
		
	}
	
	public Emp(int empid, String ename, char egen, double esal) {
		this.empid = empid;
		this.ename = ename;
		this.egen = egen;
		this.esal = esal;
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

	public char getEgen() {
		return egen;
	}

	public void setEgen(char egen) {
		this.egen = egen;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}
	
}
