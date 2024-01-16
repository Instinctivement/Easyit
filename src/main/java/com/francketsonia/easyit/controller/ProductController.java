package com.francketsonia.easyit.controller;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.service.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
@Tag(name = "product")
public class ProductController {

    private final CreateProductService createProductService;
    private final ReadProductService readProductService;
    private final UpdateProductService updateProductService;
    private final DeleteProductService deleteProductService;

    @Operation(summary = "Create a new product", description = "Create a new product")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        return createProductService.create(product);
    }

    @Operation(summary = "Get product list", description = "Get all product")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read")
    public List<Product> read(){
        return readProductService.read();
    }

    @Operation(summary = "Modify a product", description = "Modify a product")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PutMapping("/update/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
        return updateProductService.update(id, product);
    }

    @Operation(summary = "Delete a product", description = "Delete a product")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return deleteProductService.delete(id);
    }

}
