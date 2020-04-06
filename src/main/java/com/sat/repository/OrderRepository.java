package com.sat.repository;

import org.springframework.data.repository.CrudRepository;

import com.sat.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
