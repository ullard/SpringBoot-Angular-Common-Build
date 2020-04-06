package com.sat.repository;

import org.springframework.data.repository.CrudRepository;

import com.sat.model.OrderProduct;
import com.sat.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK>
{
}