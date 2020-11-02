package p2;

import java.util.ArrayList;

public class SampleAL {
	public static void main(String args[]) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(); //ArrayList is Generic
		al1.add(20);
		al1.add(50);
		al1.add(30);
		al1.add(60);
		al1.add(100);
		al1.add(20);
		al1.add(120);
		al1.add(100);
		al1.add(220);
		ArrayList<Integer> al2 = new ArrayList<Integer>(); //ArrayList is Generic
		al2.add(2);
		al2.add(57);
		al2.add(34);
		al2.add(10);
		al2.add(110);
		al2.add(240);
		al2.add(1420);
		al2.add(1070);
		al2.add(260);
		
//		al1.addAll(al2);
//		System.out.println(al1);
//		System.out.println(al1.containsAll(al2));
//		System.out.println(al1);
//		System.out.println(al1.contains(20));
//		System.out.println(al1.iterator());
//		System.out.println(al1.size());
		
		Object[] ar = al1.toArray();
		System.out.println(ar);
		
		System.out.println(al1.hashCode());
		al1.retainAll(al2);
		System.out.println(al1);
		
//		ArrayList<String>alstr = new ArrayList<String>();
		
	}
}
