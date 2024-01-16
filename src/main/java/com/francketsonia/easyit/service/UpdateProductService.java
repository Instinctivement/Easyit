package com.francketsonia.easyit.service;

import com.francketsonia.easyit.model.Product;

public interface UpdateProductService {

    Product update(Long id, Product product);

}
