package com.cap.dao;

import com.cap.bean.Product;
public interface IProductDao {
	Product getProductById(int id);
	//Product getProductByCat(String cat);
}
