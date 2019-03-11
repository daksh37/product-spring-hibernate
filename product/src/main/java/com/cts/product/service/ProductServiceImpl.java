package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
	public String addProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
