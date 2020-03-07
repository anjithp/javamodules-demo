package com.company.project.service;

import java.util.List;
import java.util.ServiceLoader;

import com.company.project.model.Product;

public interface ProductService
{

	public static ProductService newInstance(){
		ServiceLoader<ProductService> servicea = ServiceLoader.load(ProductService.class);
		for(ProductService s:servicea){
			return s;
		}
		return null;
		
	}
	
	 List<Product> findAll();
    
}
