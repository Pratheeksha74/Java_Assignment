package com.cap.client;

import java.util.Scanner;

import com.cap.bean.Product;
import com.cap.service.IProductService;
import com.cap.service.ProductServiceImpl;

public class ClientApp {

	public static void main(String[] args) {
		int totalprice = 0;
		IProductService prodserv = new ProductServiceImpl();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product id");
		int productid = scan.nextInt();
		
		System.out.println("Enter the product quantity");
		int quantity = scan.nextInt();
		
		Product prod = prodserv.getProductById(productid);
		if(prod != null) {
			System.out.println("Product found");
			System.out.println(prod.getProdid());
			System.out.println(prod.getProdname());
			System.out.println(prod.getProdcat());
			System.out.println(prod.getPrice());
			
			prod.setQuantity(quantity);
			totalprice = prod.getQuantity()*prod.getPrice();
			System.out.println("Total price of the product is "+ totalprice);
		} else {
			System.out.println("No product found");
		}
	}

}
