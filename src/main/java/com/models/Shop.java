package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shops")
public class Shop {
	
	@Id
	@Column(name="idShop")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idShop;
	
	@Column(name="shopName", nullable=false, length=40)
	private String shopName;
	
	@Column(name="shopCapacity", nullable=false, length=30)
	private int capacity; //storage space
	
	
	public long getIdShop() {
		return idShop;
	}
	public void setIdShop(long idShop) {
		this.idShop = idShop;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}