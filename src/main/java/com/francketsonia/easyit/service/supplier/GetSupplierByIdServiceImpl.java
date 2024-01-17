package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.model.Supplier;
import com.francketsonia.easyit.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetSupplierByIdServiceImpl implements GetSupplierByIdService {

    private final SupplierRepository supplierRepository;

    @Override
    public Supplier getSupplierById(Long supplierId) {
        return supplierRepository.findById(supplierId).orElseThrow(() -> new RuntimeException("Fournisseur non trouvé avec l'ID : " + supplierId));
    }
}
