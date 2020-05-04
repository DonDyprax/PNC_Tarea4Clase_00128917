package com.uca.capas.Tarea4Clase.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	@Size(min=12, max=12)
	String code;
	
	@Pattern(regexp = "[\\s]*[0-9]*[1-9]+", message="Por favor ingrese numeros enteros positivos")
	String stock;
	
	@Size(min=1, max=100)
	String name;
	
	@Size(min=1, max=100)
	String brand;
	
	@Size(min=1, max=500)
	String description;
	
	@Pattern(regexp = "(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d", message="Formato: mm/dd/yyyy")
	String date;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
