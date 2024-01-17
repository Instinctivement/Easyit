package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.model.Supplier;
import com.francketsonia.easyit.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadSupplierServiceImpl implements ReadSupplierService{

    private final SupplierRepository supplierRepository;

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

}
