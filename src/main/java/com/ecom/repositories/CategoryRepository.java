package com.ecom.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ecom.models.Category;

public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
