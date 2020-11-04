package Problem;

public class Prod {
	int prodid;
	String pname, color;
	double rate;
	Prod(){
		
	}
	public Prod(int prodid, String pname, String color, double rate) {
		super();
		this.prodid = prodid;
		this.pname = pname;
		this.color = color;
		this.rate = rate;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
