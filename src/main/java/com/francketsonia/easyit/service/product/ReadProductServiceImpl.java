package com.francketsonia.easyit.service.product;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadProductServiceImpl implements ReadProductService{

    private final ProductRepository productRepository;

    @Override
    public List<Product> read() {
        return productRepository.findAll();
    }
}
