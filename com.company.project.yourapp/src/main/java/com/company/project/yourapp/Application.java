package com.company.project.yourapp;

import com.company.project.service.ProductService;
//import com.company.project.serviceimpl.ProductServiceImpl;

public class Application {

	public static void main(String args[]) {

		ProductService ps =  ProductService.newInstance();
		//ProductService ps = new ProductServiceImpl();
		System.out.println(ps.findAll());
	}

}
