
public class Emp {
	int eid;
	String ename;
	double esal;
	static int ecount;
	//Emp this;
	
	class Address{
		int hno;
		String locality, city, pin;
		
		public Address() {
			
		}
		public Address(int hno, String locality, String city) {
			this.hno = hno;
			this.city = city;
			this.locality = locality; 
		}
		@Override
		public String toString() {
			return "Address: "+hno+" "+locality+" "+city;
		}
	}
	
	Address addr;
	
	public static class OfficeAddress{
		static int buildingno = 5005;
		static String street = "Nehru Road";
		static String city = "New Delhi";
		
		public OfficeAddress() {
			
		}
		
//		public OfficeAddress(int buildingno, String street, String city) {
//			this.buildingno = buildingno;
//			this.street = street;
//			this.city = city;
//		}
	}
	public Emp() {
		ecount++;
		addr = new Address();

	}
	
	public Emp(int eid, String ename, double esal, int hno, String city, String locality) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		addr = new Address(hno, locality, city);
		Emp.ecount++;  //Since static variable not belong to a single object but to whole class, 
									//we access them using class name as done here
	
	}
	
	static {
		System.out.println("Welcome to Static Block");
		System.out.println("Today is 28th Oct");
	}
	
	//Setter Methods
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	
	public static void countdisplay() {
		System.out.println("Count of Object:"+" "+ecount);
	}
	
	//Getter Methods
	public int getEid() {
		return this.eid;
	}
	public String getEname() {
		return this.ename;
	}
	public double getEsal() {
		return this.esal;
	}
	
	//println calls toString method
	@Override
	public String toString() {
		return "Employees values are: "+eid+" "+ename+" "+esal+" "+addr +" Office Address: " + Emp.OfficeAddress.buildingno+ " "+Emp.OfficeAddress.street+" "+Emp.OfficeAddress.city;
	}
	
	public void output() {
		System.out.println(ecount);
	}
}