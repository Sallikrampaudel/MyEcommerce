//package com.springdata;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="product")
//public class ProductEntity {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="idproduct")
//	int productid;
//	@Column(name="pname")
//	String productname;
//	@Column(name="categoryid")
//	String categoryid;
//	@Column(name="price")
//	String price;
//	@Column(name="details")
//	String details;
//	@Column(name="image")
//	String image;
//	
//	
//	public ProductEntity(int productid, String productname, String categoryid, String price, String details,
//			String image) {
//		
//		this.productid = productid;
//		this.productname = productname;
//		this.categoryid = categoryid;
//		this.price = price;
//		this.details = details;
//		this.image = image;
//	}
//
//	public ProductEntity() {
//		
//	}
//	public int getProductid() {
//		return productid;
//	}
//	public void setProductid(int productid) {
//		this.productid = productid;
//	}
//	public String getProductname() {
//		return productname;
//	}
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}
//	public String getCategoryid() {
//		return categoryid;
//	}
//	public void setCategoryid(String categoryid) {
//		this.categoryid = categoryid;
//	}
//	public String getPrice() {
//		return price;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}
//	public String getDetails() {
//		return details;
//	}
//	public void setDetails(String details) {
//		this.details = details;
//	}
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
//	
//}
