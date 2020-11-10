package com.pkg1;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	ProductDao productDao = new ProductDao();
    	Product product = new Product(2,"Laptop", "Silver",89650.0);
    	productDao.saveProduct(product);
    	
    	List<Product> products = productDao.getProducts();
    	products.forEach(p->System.out.println(p.getPname()));
    }
}
