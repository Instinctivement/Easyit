package com.francketsonia.easyit.repository;

import com.francketsonia.easyit.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
