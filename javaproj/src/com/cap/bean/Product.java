package com.cap.bean;

public class Product {
	private int prodid;
	private String Prodname;
	private String prodcat;
	private int price;
	private int quantity;
	
	public Product(int prodid, String prodname, String prodcat, int price) {
		super();
		this.prodid = prodid;
		Prodname = prodname;
		this.prodcat = prodcat;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	public int getProdid() {
		return prodid;
	}
	
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	
	public String getProdname() {
		return Prodname;
	}
	
	public void setProdname(String prodname) {
		Prodname = prodname;
	}
	
	public String getProdcat() {
		return prodcat;
	}
	
	public void setProdcat(String prodcat) {
		this.prodcat = prodcat;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", Prodname=" + Prodname + ", prodcat=" + prodcat + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
}
