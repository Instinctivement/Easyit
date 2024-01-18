package com.francketsonia.easyit.service.order_detail;

import com.francketsonia.easyit.model.OrderDetail;
import com.francketsonia.easyit.repository.OrderDetailRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadOrderDetailServiceImpl implements ReadOrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

}
