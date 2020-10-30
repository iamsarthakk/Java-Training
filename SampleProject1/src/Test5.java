
public class Test5 {

	public static void main(String[] args) {
		Emp earr[];
		earr = new Emp[4];  //4 references are declared
		earr[0] = new Emp(1001, "Kunal", 200000.00,  25,"London", "Baker Street");
		earr[1] = new Emp(1002, "Akhil", 250000.00,  25,"London", "Baker Street");
		earr[2] = new Emp(1003, "Amartya", 300000.00,  25,"London", "Baker Street");
		earr[3] = new Emp(1004, "Ankit", 275000.00,  25,"London", "Baker Street");
		
		for(int i=0;i<4;i++) {
			System.out.println(earr[i]);
		}
		
		for(Emp i : earr) {
			System.out.println(i);
		}
	
	}

}
