package com.francketsonia.easyit.service.supplier;

import com.francketsonia.easyit.model.Supplier;

public interface UpdateSupplierService {

    Supplier updateSupplier(Long supplierId, Supplier updatedSupplier);
}
