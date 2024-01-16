package com.francketsonia.easyit.service;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateProductServiceImpl implements CreateProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }


}
