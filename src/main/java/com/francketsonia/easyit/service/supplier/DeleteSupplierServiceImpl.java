package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteSupplierServiceImpl {

    private final SupplierRepository supplierRepository;
}
