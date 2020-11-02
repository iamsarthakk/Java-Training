package collectionsandmap;

import java.util.Comparator;

public class SortbyEid implements Comparator<Employee>{
	public int compare(Employee a, Employee b) {
		return a.eid-b.eid;
	}
}
