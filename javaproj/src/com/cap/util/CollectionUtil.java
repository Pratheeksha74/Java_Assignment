package com.cap.util;

import java.util.HashMap;
import java.util.Map;

import com.cap.bean.Product;
public class CollectionUtil {
	private static Map<Integer, Product> prod = new HashMap<Integer,Product>();
	static {
	prod.put(100, new Product(100,"Laptop", "electronics",78000));
	prod.put(101, new Product(101,"Mobile", "electronics",58000));
	prod.put(103, new Product(103,"T-Shrit", "cloth",8000));
	}
	
	public static Map<Integer, Product> getProd() {
		return prod;
	}
}
