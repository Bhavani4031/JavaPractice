package Bhavani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortProductObjects {

	public static void main(String[] args) {
		
		List<Products> products = new ArrayList<>();

        products.add(new Products(103, "Laptop", 75000, 4.5));
        products.add(new Products(101, "Shoes", 2500, 4.0));
        products.add(new Products(102, "Mobile", 45000, 4.7));
        products.add(new Products(104, "Watch", 5000, 3.9));
        products.add(new Products(106, "Bag", 7000, 3.9));
        products.add(new Products(105, "Bottle", 500, 3.9));

        System.out.println("Before sorting : ");
        displayProduct(products);
        
        Collections.sort(products, Comparator.comparingDouble(Products::getRating).thenComparing(Products::getPrice));
        //products.sort(Comparator.comparing(Products::getRating).thenComparing(Products::getPrice));
        System.out.println();
        
        System.out.println("After sorting : ");
        displayProduct(products);
	}
	
	public static void displayProduct(List<Products> products) {
		System.out.println("===================Product List=======================");
		Iterator<Products> it = products.iterator();
		while(it.hasNext()) {
			Products n = it.next();
			System.out.println(n);
		}
	}
}
class Products {
	
    private int productId;
    private String productName;
    private double price;
    private double rating;

    public Products(int productId, String productName, double price, double rating) {
        this.productId = productId;
    	this.productName = productName;
        this.price = price;
        this.rating = rating;
    }
    
    //public int getProductId() { return productId; }
    //public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return "Product [Id=" + productId +
               ", Name=" + productName +
               ", Price=" + price +
               ", Rating=" + rating + "]";
    }
}

