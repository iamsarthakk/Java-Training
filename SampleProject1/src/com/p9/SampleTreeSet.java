package com.p9;

import java.util.Iterator;
import java.util.TreeSet;

public class SampleTreeSet {
	public static void main(String args[]) {
	TreeSet<String> ts = new TreeSet<String>(new MyComp());
	ts.add("C");
	ts.add("A");
	ts.add("B");
	ts.add("E");
	ts.add("F");
	ts.add("D");
	System.out.print(ts);
	Iterator i = ts.iterator();
	while(i.hasNext()) {
			Object element = i.next();
			System.out.print(element + " ");
		}
	System.out.println();
	System.out.print(ts);
	}
	
}


