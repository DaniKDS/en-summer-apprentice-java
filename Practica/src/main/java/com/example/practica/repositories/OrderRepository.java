package com.example.practica.repositories;

import com.example.practica.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> getOrdersByCustomerCustomerId(Long customerId);
    Order getOrdersByOrderId(Long orderId);
}
