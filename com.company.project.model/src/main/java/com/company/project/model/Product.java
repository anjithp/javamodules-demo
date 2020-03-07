package com.company.project.model;

public class Product {

	private final String name;

	private final String code;

	public Product(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "name= " + this.name + " Code= " + this.code;
	}

}
