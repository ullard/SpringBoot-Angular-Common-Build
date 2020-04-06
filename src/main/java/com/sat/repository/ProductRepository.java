package com.sat.repository;

import org.springframework.data.repository.CrudRepository;

import com.sat.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>
{
}
