package com.pramod.course.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private String descriptio;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriptio() {
		return descriptio;
	}
	public void setDescriptio(String descriptio) {
		this.descriptio = descriptio;
	}

}
