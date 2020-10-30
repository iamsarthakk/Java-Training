
public class Multiplication_Table {

	public static void main(String[] args) {
		int num =15;
		int i;
		
		System.out.println("For Loop");
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		System.out.println("While Loop");
		i=1;
		while(i<=10) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}
		
		i = 1;
		System.out.println("do while Loop");

		do {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while(i<=10);
	}

}
