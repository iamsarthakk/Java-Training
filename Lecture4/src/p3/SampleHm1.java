package p3;

import java.util.HashMap;

import p2.Emp;

public class SampleHm1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(101, "New Delhi");
		hm1.put(102, "Moscow");
		hm1.put(103, "Brussels");
		hm1.put(104, "Singapore");
		hm1.put(105, "Melbourne");
		System.out.println(hm1);
		
		HashMap<Integer, Emp> hemp1 = new HashMap<Integer, Emp>();
		hemp1.put(1001,  new Emp(1, "Rishab", 'M', 150000.00));
	}

}
