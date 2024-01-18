package com.francketsonia.easyit.service.order_detail;

import com.francketsonia.easyit.model.OrderDetail;
import com.francketsonia.easyit.repository.OrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateOrderDetailServiceImpl implements UpdateOrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail updateOrderDetail(Long orderDetailId, OrderDetail updatedOrderDetail) {
        return orderDetailRepository.findById(orderDetailId)
                .map(existingOrderDetail -> {
                    existingOrderDetail.setOrder(updatedOrderDetail.getOrder());
                    existingOrderDetail.setProduct(updatedOrderDetail.getProduct());
                    existingOrderDetail.setQuantity(updatedOrderDetail.getQuantity());
                    existingOrderDetail.setUnit_price(updatedOrderDetail.getUnit_price());

                    return orderDetailRepository.save(existingOrderDetail);
                })
                .orElseThrow(() -> new RuntimeException("Détail de commande non trouvé avec l'ID : " + orderDetailId));
    }

}
