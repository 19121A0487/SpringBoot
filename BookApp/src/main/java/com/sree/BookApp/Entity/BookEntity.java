package com.sree.BookApp.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class BookEntity {
	
	@Id
	@Column(name="bid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bid;
	@Column(name="book_name")
	String name;
	@Column(name="book_author")
	String author;
	public int getBid() {
		return bid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public BookEntity(String name, String author) {
		super();
		
		this.name = name;
		this.author = author;
	}
	public BookEntity() {
		super();
	}
	@Override
	public String toString() {
		return "BookEntity [bid=" + bid + ", name=" + name + ", author=" + author + "]";
	}
	
	
	

}
