package com.ecom.services;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ecom.models.Product;
import com.ecom.repositories.ProductRepository;
import com.ecom.responswrapper.ProductRR;
 
@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public ResponseEntity<?> addProduct(Product product) {
		productRepository.save(product);
		return new ResponseEntity<>("Product Added" , HttpStatus.CREATED);
	}
	
	public ResponseEntity<?> getAllProducts() {
		Iterable<Product> data = productRepository.findAll();
		Iterator<Product> all_products = data.iterator();
		if(all_products.hasNext()) {
			ProductRR prr = new ProductRR();
			prr.setMessage("Following product found");
			prr.setData(all_products);
			return new ResponseEntity<>(prr,HttpStatus.FOUND);
		}
		else
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No Products found in database");
		}
		
	}
}
