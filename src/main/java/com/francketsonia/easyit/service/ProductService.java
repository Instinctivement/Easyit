package com.francketsonia.easyit.service;

import com.francketsonia.easyit.model.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    List<Product> read();

    Product update(Long id, Product product);

    String delete(Long id);

}
