package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.model.Supplier;
import com.francketsonia.easyit.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateSupplierServiceImpl implements UpdateSupplierService {

    private final SupplierRepository supplierRepository;

    @Override
    public Supplier updateSupplier(Long supplierId, Supplier updatedSupplier) {
        return supplierRepository.findById(supplierId)
                .map(existingSupplier -> {
                    existingSupplier.setSupplier_name(updatedSupplier.getSupplier_name());
                    existingSupplier.setSupplier_phone(updatedSupplier.getSupplier_phone());
                    existingSupplier.setSupplier_address(updatedSupplier.getSupplier_address());

                    return supplierRepository.save(existingSupplier);
                })
                .orElseThrow(() -> new RuntimeException("Fournisseur non trouvé avec l'ID : " + supplierId));
    }
}
