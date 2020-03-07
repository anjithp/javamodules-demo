package com.company.project.serviceimpl;

import java.util.List;
import java.util.ArrayList;

import com.company.project.model.Product;
import com.company.project.service.ProductService;



public class ProductServiceImpl implements ProductService
{

	@Override
	public List<Product> findAll() {
		Product p = new Product("xxx", "123");
        List<Product> l =  new ArrayList<>();
        l.add(p);
        return l;
    }
    
    
}
