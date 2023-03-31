package com.buynow.buynow.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_id")
	private int product_id;
	@Column(name = "category_id")
	private int category_id;
	@Column(name = "price")
	private int price;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "orderdate")
	private Date orderdate;
	@Column(name = "shippingdate")
	private Date shippingdate;
	@Column(name = "discount")
	private int discount;
	@Column(name = "brand_id")
	private int brand_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
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
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public Date getShippingdate() {
		return shippingdate;
	}
	public void setShippingdate(Date shippingdate) {
		this.shippingdate = shippingdate;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	
}
