
public class Greatest_Number {

	public static void main(String[] args) {
		int n1 = 5, n2=10;
		int max;
		if(n1>n2) 
			max = n1;
		else
			max = n2;
		
		System.out.println("Max of two nos is "+max);
		
		int n3 = 2;
		
		if(n1>=n2 && n1>=n3)
			max = n1;
		else if(n2>=n1 && n2>=n3)
			max = n2;
		else
			max = n3;
		System.out.println("Max of three nos is "+max);
		

	}

}
