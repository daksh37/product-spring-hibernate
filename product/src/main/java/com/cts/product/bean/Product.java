package com.cts.product.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductTable")
public class Product {
	 @Id
	 private int id; 
	 private int quantity;
	 private int price;
	 
	 private String name;
	 @Override
	public String toString() {
		return "Product [quantity=" + quantity + ", price=" + price + ", id=" + id + ", name=" + name + "]";
	}
	
	
	public Product() {	
	// TODO Auto-generated constructor stub
		
	} 
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
