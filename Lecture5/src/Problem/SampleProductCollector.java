package Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SampleProductCollector {

	public static void main(String[] args) {
		List<Product1> productList = new ArrayList<Product1>();
		
		productList.add(new Product1(1, "HP Laptop", 25000f));
		productList.add(new Product1(1, "Dell Laptop", 3000f));
		productList.add(new Product1(1, "Lenevo Laptop", 28000f));
		productList.add(new Product1(1, "Sony Laptop", 28000f));
		productList.add(new Product1(1, "Apple Laptop", 90000f));
		
		List<Float> productPriceList = 
					productList.stream().map(x->x.price).collect(Collectors.toList());
		System.out.println(productPriceList);
	}

}
