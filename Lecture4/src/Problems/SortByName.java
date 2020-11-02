package Problems;

import java.util.Comparator;


public class SortByName implements Comparator<Emp>{
	public int compare(Emp a, Emp b) {
		return a.ename.compareTo(b.ename);
	}
}
