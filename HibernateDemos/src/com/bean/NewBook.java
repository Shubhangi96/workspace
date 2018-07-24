package com.bean;

import java.io.Serializable;
import java.sql.Date;

public class NewBook implements Serializable{
	private String isbn;
	private String title;
	private String author;
	private Double price; //wrapper class Double
	private Long stock;
	private Date dop;
	public NewBook() {
		super();
	}
	public NewBook(String isbn, String title, String author, Double price, Long stock, Date dop) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
		this.dop = dop;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
@Override
	public String toString()
	{
		return this.isbn+" "+this.title+" "+this.author+" "+this.price+" "+this.stock+" "+this.dop;
	}
}
