package com.ecom.controllers;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.models.Product;
import com.ecom.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	@PostMapping("")
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
		
	}
	
	@GetMapping("")
	public ResponseEntity<?> getAllProducts() {
		
		return productService.getAllProducts();
	}
	
	
}
