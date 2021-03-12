package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
	int proID;
	String name;
	int price;
	public Product(int proID, String name, int price) {
		super();
		this.proID = proID;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [proID=" + proID + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class CollectionProduct {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(1,"Prod1",300));
		al.add(new Product(1,"Prod2",100));
		al.add(new Product(1,"Prod3",400));
		al.add(new Product(1,"Prod4",600));
		al.add(new Product(1,"Prod5",50));
		
		Iterator<Product> iter = al.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			if(p.price < 200) {
				System.out.println(p);
			}
		}		
	}
}
