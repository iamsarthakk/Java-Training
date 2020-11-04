package Problem;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {
	LinkedList<Prod> p;
	ProductList(){
		 this.p=new LinkedList<Prod>();
	}
	
	List<Prod> getProductsofSameColor(String col) {
		List<Prod> l = p.stream().filter(c->(c.color.compareTo(col)==0)).collect(Collectors.toList());
		return l;
	}

}
