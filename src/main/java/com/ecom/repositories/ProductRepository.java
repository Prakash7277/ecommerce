package com.ecom.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ecom.models.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

}
