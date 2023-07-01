package com.gebeya.ecommerce.orderservice.repository;

import com.gebeya.ecommerce.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
