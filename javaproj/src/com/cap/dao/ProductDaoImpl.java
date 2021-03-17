package com.cap.dao;

import java.util.Map;

import com.cap.bean.Product;
import com.cap.util.CollectionUtil;

public class ProductDaoImpl implements IProductDao {
	
	CollectionUtil util = new CollectionUtil();
	
	@Override
	public Product getProductById(int id) {
		Map<Integer, Product> hashmap = util.getProd();
		Product p = hashmap.get(id);
		return p;
	}

//	@Override
//	public Product getProductByCat(String cat) {
//		Map<Integer, Product> hashmap = util.getProd();
//		if(hashmap.values().equals(cat)) 
//			return ;
//		return null;
//	}


}
