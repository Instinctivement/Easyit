package com.francketsonia.easyit.service.order_detail;

import com.francketsonia.easyit.model.OrderDetail;
import com.francketsonia.easyit.repository.OrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetOrderDetailByIdServiceImpl implements GetOrderDetailByIdService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail getOrderDetailById(Long orderDetailId) {
        return orderDetailRepository.findById(orderDetailId).orElseThrow(() -> new RuntimeException("Détail de commande non trouvé avec l'ID : " + orderDetailId));
    }

}
