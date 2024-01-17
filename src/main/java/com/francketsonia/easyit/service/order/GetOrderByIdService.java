package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.model.Order;

public interface GetOrderByIdService {

    Order getOrderById(Long orderId);
}
