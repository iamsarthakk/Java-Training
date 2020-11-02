package Problems;

import java.util.Comparator;

public class SortBySalary implements Comparator<Emp> {
	public int compare(Emp a, Emp b) {
		if(a.salary<b.salary)
			return -1;
		else
			return 1;
	}
}
