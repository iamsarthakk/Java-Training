
public class Test4 {

	public static void main(String[] args) {
		Emp eobj;    //Reference
		eobj = new Emp();  //object

		System.out.println("Count after first creation "+Emp.ecount);
		
		Emp eobj1 = new Emp(102, "Sahil", 100000.00, 75, "Delhi", "Shahdara");
		System.out.println("Count after second creation "+Emp.ecount);
		
		Emp eobj2 = new Emp(103, "Shivam", 150000.00,  25,"London", "Baker Street" );
		System.out.println("Count after third creation "+Emp.ecount);
		
		eobj.setEid(104);
		System.out.println(eobj.getEid());
		System.out.println(eobj1);
		System.out.println(eobj2);
	}

}
