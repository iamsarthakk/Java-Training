package p3;

import java.util.Comparator;

public class MyComp implements Comparator{
	public int compare(Object a, Object b) {
		String aStr, bStr;
		aStr = (String) a;
		bStr = (String) b;
		return aStr.compareTo(bStr);
	}
}
