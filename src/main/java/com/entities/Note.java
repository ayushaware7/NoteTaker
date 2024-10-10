package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note {
	private int id;
	private String title;
	private String content;
	private Date addedDate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddeDate() {
		return addedDate;
	}
	public void setAddeDate(Date addeDate) {
		this.addedDate = addeDate;
	}
	
	public Note(String title, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(10000);
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
