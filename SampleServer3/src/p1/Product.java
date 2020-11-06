package p1;

public class Product {
	int productid;
	String pname, color;
	double rate;
	public Product(int productid, String pname, String color, double rate) {
		super();
		this.productid = productid;
		this.pname = pname;
		this.color = color;
		this.rate = rate;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
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
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", pname=" + pname + ", color=" + color + ", rate=" + rate + "]";
	}
}
