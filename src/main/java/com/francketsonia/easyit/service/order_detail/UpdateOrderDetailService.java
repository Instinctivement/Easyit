package com.francketsonia.easyit.service.order_detail;

import com.francketsonia.easyit.model.OrderDetail;

public interface UpdateOrderDetailService {

    OrderDetail updateOrderDetail(Long orderDetailId, OrderDetail updatedOrderDetail);

}
