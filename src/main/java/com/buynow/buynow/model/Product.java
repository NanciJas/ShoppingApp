package com.buynow.buynow.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "product")
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -610522901066770066L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private int id;
	@Column(name = "product_name")
	private String product_name;
	@Column(name = "description")
	private String description;
	@Column(name = "category_id")
	private int category_id;
	@Column(name = "price")
	private int price;
	@Column(name = "supplier_id")
	private int supplier_id;
	@Column(name = "quantity_perunit")
	private int quantity_perunit;
	@Column(name = "units_inStock")
	private int units_inStock;
	@Column(name = "brand_id")
	private int brand_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public int getQuantity_perunit() {
		return quantity_perunit;
	}
	public void setQuantity_perunit(int quantity_perunit) {
		this.quantity_perunit = quantity_perunit;
	}
	public int getUnits_inStock() {
		return units_inStock;
	}
	public void setUnits_inStock(int units_inStock) {
		this.units_inStock = units_inStock;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	
	
}

