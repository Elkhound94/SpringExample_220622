package com.example.lesson03.model;

import java.util.Date;

public class Review {
	private int id;
	private String storeName;
	private String menu;
	private String userName;
	private double point;
	private String review;
	private Date createdAt;
	private Date updatedAt;
	
	
	public int getId() {
		return id;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getMenu() {
		return menu;
	}
	public String getUserName() {
		return userName;
	}
	public double getPoint() {
		return point;
	}
	public String getReview() {
		return review;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}