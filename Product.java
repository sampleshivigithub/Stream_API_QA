package app_java_10;

//04/09/2023

// product F.java connect to Product.java 

public class Product {
      private int id;
      private String name;
      private double amount;
      
	public Product(int id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public Object contentEquals(String string) {
		
		return ("T-Shirt");
	}
      	
}
