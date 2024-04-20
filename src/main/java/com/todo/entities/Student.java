package com.todo.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class Student {
	@Id
	  
	private int id;
	private String name;
	@Column(length=500)
	private String title;
	@Column(length=50)
	private Date date;
	@Column(length=2000)
	private String descr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Student( String name, String title, Date date, String descr) {
		super();
		this.id = new Random().nextInt(100000);
		this.name = name;
		this.title = title;
		this.date = date;
		this.descr = descr;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
