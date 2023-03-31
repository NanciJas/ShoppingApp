package com.buynow.buynow.model;

import javax.persistence.*;


@Entity
@Table(name = "suppliers")
public class Suppliers {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "companyname")
	private String companyname;
	@Column(name = "contactname")
	private String contactname;
	@Column(name = "contact_title")
	private String contact_title;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "region")
	private String region;
	@Column(name = "postalcode")
	private String postalcode;
	@Column(name = "phone")
	private String phone;
	@Column(name = "fax")
	private int fax;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getContact_title() {
		return contact_title;
	}
	public void setContact_title(String contact_title) {
		this.contact_title = contact_title;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	

}
