package com.firstfullwebservice.fullwebservice;

import org.springframework.stereotype.Component;

//@Component
public class CatBean {
	
	private String catName;
	private String catColor;

	public CatBean(String catName, String catColor) {
		super();
		this.catName = catName;
		this.catColor = catColor;
	}
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatColor() {
		return catColor;
	}
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}

	@Override
	public String toString() {
		return "CatBean [catName=" + catName + ", catColor=" + catColor + "]";
	}
	
	
}
