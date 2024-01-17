package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.repository.SupplierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteSupplierServiceImpl implements DeleteSupplierService {

    private final SupplierRepository supplierRepository;

    @Override
    public String deleteSupplier(Long supplierId) {
        supplierRepository.deleteById(supplierId);
        return "Fournisseur supprimé avec succès";
    }

}
