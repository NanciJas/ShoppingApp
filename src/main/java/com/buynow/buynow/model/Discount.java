package com.buynow.buynow.model;

import java.util.*;

import javax.persistence.*;


@Entity
@Table(name = "discount")
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dis_code")
	private int dis_code;
	@Column(name = "product_id")
	private int product_id;
	@Column(name = "startdate")
	private Date startdate;
	@Column(name = "enddate")
	private Date enddate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDis_code() {
		return dis_code;
	}
	public void setDis_code(int dis_code) {
		this.dis_code = dis_code;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
}
