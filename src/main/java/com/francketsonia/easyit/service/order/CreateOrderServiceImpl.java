package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.model.Order;
import com.francketsonia.easyit.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOrderServiceImpl implements CreateOrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
