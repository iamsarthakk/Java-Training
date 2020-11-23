package com.p8;

public class TestMain {

	public static void main(String[] args) {
		C1 obj = new C1();
		
		
		I iobj = new I() {
			public void display() {
				int a = 20;
				System.out.println(a);
			}
		};
		I obj1= ()-> { 
              int a=30;
               System.out.println(a);
          };

		iobj.display();
		obj1.display();
	}

}
