package com.francketsonia.easyit.controller;

import com.francketsonia.easyit.model.Order;
import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.service.order.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
@Tag(name = "order")
public class OrderController {

    private final CreateOrderService createOrderService;
    private final DeleteOrderService deleteOrderService;
    private final GetOrderByIdService getOrderByIdService;
    private final ReadOrderService readOrderService;
    private final UpdateOrderService updateOrderService;

    @Operation(summary = "Create a new order", description = "Create a new order")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PostMapping("/create")
    public Order create(@RequestBody Order order){
        return createOrderService.saveOrder(order);
    }

    @Operation(summary = "Get order list", description = "Get all order")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read")
    public List<Order> read(){
        return readOrderService.getAllOrders();
    }

    @Operation(summary = "Get one order", description = "Get one order by id")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read/{id}")
    public Order readById(@PathVariable Long id){
        return getOrderByIdService.getOrderById(id);
    }

    @Operation(summary = "Modify a order", description = "Modify a order")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PutMapping("/update/{id}")
    public Order update(@PathVariable Long id, @RequestBody Order order){
        return updateOrderService.updateOrder(id, order);
    }

    @Operation(summary = "Delete a order", description = "Delete a order")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return deleteOrderService.deleteOrder(id);
    }

}
