package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteOrderServiceImpl implements DeleteOrderService {

    private final OrderRepository orderRepository;

    @Override
    public String deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
        return "Commande supprimé avec succès";
    }
}
