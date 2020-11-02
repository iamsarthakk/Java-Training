package collectionsandmap;

public class Employee {
	int eid;
	String name, address;
	Employee(){
		
	}
	Employee(int eid, String name, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return eid + " " + name + " " + address ;
	}
}
