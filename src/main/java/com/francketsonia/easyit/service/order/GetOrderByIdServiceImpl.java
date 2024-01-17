package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.model.Order;
import com.francketsonia.easyit.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetOrderByIdServiceImpl implements GetOrderByIdService {

    private final OrderRepository orderRepository;

    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Commande non trouvée avec l'ID : " + orderId));
    }

}
