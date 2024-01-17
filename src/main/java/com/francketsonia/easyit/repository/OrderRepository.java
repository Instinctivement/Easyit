package com.francketsonia.easyit.repository;

import com.francketsonia.easyit.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
