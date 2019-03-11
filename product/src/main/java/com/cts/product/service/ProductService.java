package com.cts.product.service;

import java.util.List;


import com.cts.product.bean.Product;
public interface ProductService {
	public  String addProduct();
	public String deleteProduct();
	public String updateProduct();
	public List<Product> getAllProduct();
}
