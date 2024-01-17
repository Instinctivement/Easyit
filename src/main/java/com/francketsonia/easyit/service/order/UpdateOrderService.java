package com.francketsonia.easyit.service.order;

import com.francketsonia.easyit.model.Order;

public interface UpdateOrderService {

    Order updateOrder(Long orderId, Order updatedOrder);
}
