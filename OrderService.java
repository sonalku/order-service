package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;
	
	public void insertOrder(OrderVO order) {
		
		System.out.println("I am in Insert Order");
		repository.save(order);
	}
}
