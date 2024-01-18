package com.francketsonia.easyit.service.order_detail;

import com.francketsonia.easyit.model.OrderDetail;
import com.francketsonia.easyit.repository.OrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateOrderDetailServiceImpl implements CreateOrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

}
