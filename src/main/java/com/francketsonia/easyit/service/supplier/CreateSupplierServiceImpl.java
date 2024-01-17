package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.model.Supplier;
import com.francketsonia.easyit.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateSupplierServiceImpl implements  CreateSupplierService {

    private final SupplierRepository supplierRepository;

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

}
