package com.acme.order.customer;

import org.springframework.data.repository.CrudRepository;

import com.acme.order.pizza.PizzaOrder;

public interface CustomerTypeRepository extends CrudRepository<CustomerType, Long> {

}
