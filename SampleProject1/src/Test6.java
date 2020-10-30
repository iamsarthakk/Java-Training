public class Test6 
{
	static void vaTest(double n, int ... v) 
	  {
	    System.out.println(n);
	     for(int i:v)
	       System.out.println(i);
	    }
	 
	static void vaTest(int ... v)
	   {
	    System.out.print("Number of args: "
	                     +v.length +"Contents:");
	      for(int x : v)
	        System.out.print(x + " ");
	      System.out.println();
	  }
	
	public static void main(String args[]){
		vaTest(10);      // 1 arg
		vaTest(1, 2, 3); // 3 args
		vaTest();        // no args
		vaTest(10.75,10,20);
	}
}