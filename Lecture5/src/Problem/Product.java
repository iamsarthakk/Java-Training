package Problem;

public class Product {
	int pId, pqty;
	String pname;
	double prate, value;
	
	Product(){
		
	}
	public Product(int pId, int pqty, String pname, double prate, double value) {
		super();
		this.pId = pId;
		this.pqty = pqty;
		this.pname = pname;
		this.prate = prate;
		this.value = value;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getPqty() {
		return pqty;
	}
	public void setPqty(int pqty) {
		this.pqty = pqty;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrate() {
		return prate;
	}
	public void setPrate(double prate) {
		this.prate = prate;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
