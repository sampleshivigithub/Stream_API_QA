package app_java_10;

//04/09/2023

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class F {
	public static void main(String[] args) {
		
		ArrayList<Product> data = new ArrayList<Product>();
		
		data.add(new Product(1, "T-Shirt", 200));
		data.add(new Product(2, "Kurti", 500));
		data.add(new Product(3, "Jeans", 800));
		data.add(new Product(4, "Shoe", 900));
		data.add(new Product(5, "Lehanga", 4200));
		data.add(new Product(6, "Shirt", 200));
		
		  List<Product> newData = data.stream().filter
				(p->p.getAmount()==200.0).collect(Collectors.toList());
		 
		  System.out.println(newData);
		  
		for(Product product : newData) {
			
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getAmount());
		}
	}
}
