package application;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product p = new Product("Tv", 1000.0);
		
		OrderItem oi1 = new OrderItem(null, 0, p);
		
	}

}
