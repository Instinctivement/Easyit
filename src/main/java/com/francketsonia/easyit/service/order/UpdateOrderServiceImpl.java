package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.model.Order;
import com.francketsonia.easyit.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateOrderServiceImpl implements UpdateOrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order updateOrder(Long orderId, Order updatedOrder) {
        return orderRepository.findById(orderId)
                .map(existingOrder -> {
                    existingOrder.setUser(updatedOrder.getUser());
                    existingOrder.setOrder_date(updatedOrder.getOrder_date());
                    existingOrder.setOrder_status(updatedOrder.getOrder_status());

                    return orderRepository.save(existingOrder);
                })
                .orElseThrow(() -> new RuntimeException("Commande non trouvée avec l'ID : " + orderId));
    }
}
