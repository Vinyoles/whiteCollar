package com.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paintings")
public class Painting {

	@Id
	@Column(name="idPainting")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPainting;
	
	@Column(name="author", nullable=true, length=30)
	private String author;
	
	@Column(name="title", nullable=false, length=100)
	private String title;
	
	@Column(name="price", nullable=false, length=30)
	private double price;
	
	@Column(name="entryDate", nullable=true)
	private Timestamp entryDate;
	
	@Column(name="shop_id", nullable=false)
	private long shop_id;
	
	
	
	public long getIdPainting() {
		return idPainting;
	}
	public void setIdPainting(long idPainting) {
		this.idPainting = idPainting;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Timestamp getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Timestamp entryDate) {
		this.entryDate = entryDate;
	}
	public long getShop_id() {
		return shop_id;
	}
	public void setShop_id(long shop_id) {
		this.shop_id = shop_id;
	}
}
