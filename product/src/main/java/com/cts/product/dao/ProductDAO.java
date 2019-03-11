package com.cts.product.dao;

import java.util.List;


import com.cts.product.bean.Product;
public interface ProductDAO {
	public  String addProduct();
	public String deleteProduct();
	public String updateProduct();
	public List<Product> getAllProduct();
	

}
