package pk1;

public class Employee {
	int eid;
	String ename;
	public Employee() {
		
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
	
	public boolean equals(Employee eobj) {
		if(this.eid==eobj.eid && this.ename.equals(eobj.ename))
			return true;
		else
			return false;
	}
	
}
