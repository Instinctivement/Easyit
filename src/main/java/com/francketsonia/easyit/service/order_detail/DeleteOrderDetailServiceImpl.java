package com.francketsonia.easyit.service.order_detail;

import com.francketsonia.easyit.repository.OrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteOrderDetailServiceImpl implements DeleteOrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public String deleteOrderDetail(Long orderDetailId) {
        orderDetailRepository.deleteById(orderDetailId);
        return "Detail de commande supprimé avec succès";
    }
}
