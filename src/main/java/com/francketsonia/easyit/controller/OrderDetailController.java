package com.francketsonia.easyit.controller;

import com.francketsonia.easyit.model.Order;
import com.francketsonia.easyit.model.OrderDetail;
import com.francketsonia.easyit.service.order_detail.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderdetail")
@AllArgsConstructor
@Tag(name = "orderdetail")
public class OrderDetailController {

    private final CreateOrderDetailService createOrderDetailService;
    private final DeleteOrderDetailService deleteOrderDetailService;
    private final GetOrderDetailByIdService getOrderDetailByIdService;
    private final ReadOrderDetailService readOrderDetailService;
    private final UpdateOrderDetailService updateOrderDetailService;

    @Operation(summary = "Create a new order detail", description = "Create a new order detail")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PostMapping("/create")
    public OrderDetail create(@RequestBody OrderDetail order){
        return createOrderDetailService.saveOrderDetail(order);
    }

    @Operation(summary = "Get order detail list", description = "Get all order detail")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read")
    public List<OrderDetail> read(){
        return readOrderDetailService.getAllOrderDetails();
    }

    @Operation(summary = "Get one order detail", description = "Get one order detail by id")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read/{id}")
    public OrderDetail readById(@PathVariable Long id){
        return getOrderDetailByIdService.getOrderDetailById(id);
    }

    @Operation(summary = "Modify a order detail", description = "Modify a order detail")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PutMapping("/update/{id}")
    public OrderDetail update(@PathVariable Long id, @RequestBody OrderDetail order){
        return updateOrderDetailService.updateOrderDetail(id, order);
    }

    @Operation(summary = "Delete a order detail", description = "Delete a order detail")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return deleteOrderDetailService.deleteOrderDetail(id);
    }

}
