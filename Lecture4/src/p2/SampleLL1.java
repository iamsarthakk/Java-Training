package p2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SampleLL1 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("mukesh");
		ll1.add("ankit");
		ll1.add("danveer");
		ll1.add("prateek");
		ll1.add("rishab");
		ll1.add("sahil");
		ll1.add("mukesh");
		System.out.println(ll1);
		
		String str = " ";
		Iterator<String> itr = ll1.iterator();  //the iterator (pointer) object is positioned before
																//the first element in the string

		while(itr.hasNext()) {
			str = (String)itr.next();  //down casting
			System.out.print(str+", ");
		}
		System.out.println();
		
		ListIterator<String> litr = ll1.listIterator();
		while(litr.hasNext()) {
			str = (String)litr.next();
			System.out.print(str+" ");
		}
		System.out.println();
		while(litr.hasPrevious()) {
			str = (String)litr.previous();
			System.out.print(str+" ");
		}
	}

}
