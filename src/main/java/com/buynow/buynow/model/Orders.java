package com.buynow.buynow.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "product_id")
	private int product_id;
	@Column(name = "order_date")
	private Date order_date;
	@Column(name = "shipped_date")
	private String shipped_date;
	@Column(name = "ship_via")
	private String ship_via;
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
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getShipped_date() {
		return shipped_date;
	}
	public void setShipped_date(String shipped_date) {
		this.shipped_date = shipped_date;
	}
	public String getShip_via() {
		return ship_via;
	}
	public void setShip_via(String ship_via) {
		this.ship_via = ship_via;
	}
	
	
}
