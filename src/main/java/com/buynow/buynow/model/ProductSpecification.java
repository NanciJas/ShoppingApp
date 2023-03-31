package com.buynow.buynow.model;

import javax.persistence.*;

@Entity
@Table(name = "productSpecification")
public class ProductSpecification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_id")
	private int product_id;
	@Column(name = "spec_key")
	private String spec_key;
	@Column(name = "spec_value")
	private String spec_value;
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
	public String getSpec_key() {
		return spec_key;
	}
	public void setSpec_key(String spec_key) {
		this.spec_key = spec_key;
	}
	public String getSpec_value() {
		return spec_value;
	}
	public void setSpec_value(String spec_value) {
		this.spec_value = spec_value;
	}
	
}
