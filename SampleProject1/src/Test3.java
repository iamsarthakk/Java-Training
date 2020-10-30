
public class Test3 {

	public static void main(String[] args) {
		
//		//Arrays in Java
//		int arr[];     			 //step 1
//		arr = new int[4];   //step2
//		arr[0] = 25;
//		arr[1] = 35;
//		arr[2] = 15;
//		arr[3] = 5;
//		
//		String sarr[];
//		sarr = new String[5];
//		sarr[0]="Sarthak";
//		sarr[1]="Abhigyan";
//		sarr[2]="Riaz";
//		sarr[3]="Ankit";
//		sarr[4]="Danveer";
//		
//		double darr[];
//		darr = new double[4];
//		darr[0]=1.22;
//		darr[1]=4.20;
//		darr[2]=2.12;
//		darr[3]=8.42;
//		darr[0]=1.22;
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(sarr[i]);
//		}
//		
//		
//		
//		//Enhanced For Loop
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		
//		for(String s : sarr) {
//			System.out.println(s);
//		}
//		
//		for(double d : darr) {
//			System.out.println(d);
//		}
//		
		
		
		//2D Array
		int mat1[][];
		mat1 = new int[2][3];
		mat1[0][0]=25;
		mat1[0][1]=5;
		mat1[0][2]=35;
		mat1[1][0]=45;
		mat1[1][1]=75;
		mat1[1][2]=65;
		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println(mat1[i][j]);
//			}
//		}
		
		for(int[] i : mat1) {
			for(int j:i)
				System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
