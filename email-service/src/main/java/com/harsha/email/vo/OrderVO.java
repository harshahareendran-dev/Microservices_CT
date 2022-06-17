package com.harsha.email.vo;

import java.io.Serializable;

public class OrderVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Integer id;

	String item;
	float price;
	String email;
	int quantity;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
