package com.acme;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acme.order.customer.Customer;
import com.acme.order.customer.CustomerRepository;
import com.acme.order.customer.CustomerType;
import com.acme.order.customer.CustomerTypeRepository;
import com.acme.order.pizza.OrderRepository;
import com.acme.order.pizza.PizzaOrder;
import com.acme.order.pizza.PizzaType;
import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTutorialApplication.class)
public class JpaTutorialApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	CustomerTypeRepository customerTypeRepository;
	
	
	@Test
	public void contextLoads() {
		
		
	}

	@Test
	public void dataLoads() {
		
		CustomerType customerType1 = new CustomerType(null, "Profesjonalista");
		CustomerType customerType2 = new CustomerType(null,"Profesjonalista2");
		customerTypeRepository.save(Lists.newArrayList(customerType1,customerType2));
//		
		Customer customer1 = new Customer(null, "Mati", "mail", "adres",customerType1);
		Customer customer2 = new Customer(null, "Mati", "mail", "adres2",customerType2);
		customerRepository.save(Lists.newArrayList(customer1,customer2));
//		
//		PizzaOrder pizzaOrder1 = new PizzaOrder(customer1, PizzaType.BIG);
//		PizzaOrder pizzaOrder2 = new PizzaOrder(customer2,PizzaType.LARGE);
//		orderRepository.save(Lists.newArrayList(pizzaOrder1,pizzaOrder2));
		
		
		
	}

}
