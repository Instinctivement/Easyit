package com.francketsonia.easyit.controller;

import com.francketsonia.easyit.model.Supplier;
import com.francketsonia.easyit.service.supplier.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@AllArgsConstructor
@Tag(name = "supplier")
public class SupplierController {

    private final CreateSupplierService createSupplierService;
    private final DeleteSupplierService deleteSupplierService;
    private final GetSupplierByIdService getSupplierByIdService;
    private final ReadSupplierService readSupplierService;
    private final UpdateSupplierService updateSupplierService;

    @Operation(summary = "Create a new supplier", description = "Create a new supplier")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PostMapping("/create")
    public Supplier create(@RequestBody Supplier supplier){
        return createSupplierService.saveSupplier(supplier);
    }

    @Operation(summary = "Get supplier list", description = "Get all supplier")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read")
    public List<Supplier> read(){
        return readSupplierService.getAllSuppliers();
    }

    @Operation(summary = "Get one supplier", description = "Get one supplier by id")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read/{id}")
    public Supplier readById(@PathVariable Long id){
        return getSupplierByIdService.getSupplierById(id);
    }

    @Operation(summary = "Modify a supplier", description = "Modify a supplier")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PutMapping("/update/{id}")
    public Supplier update(@PathVariable Long id, @RequestBody Supplier supplier){
        return updateSupplierService.updateSupplier(id, supplier);
    }

    @Operation(summary = "Delete a supplier", description = "Delete a supplier")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return deleteSupplierService.deleteSupplier(id);
    }
}
