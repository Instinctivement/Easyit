package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.model.Order;
import com.francketsonia.easyit.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadOrderServiceImpl implements ReadOrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}
