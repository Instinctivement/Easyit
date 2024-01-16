package com.francketsonia.easyit.service;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateProductServiceImpl implements UpdateProductService {

    private final ProductRepository productRepository;

    @Override
    public Product update(Long id, Product product) {
        return productRepository.findById(id)
                .map(p -> {
                    p.setName(product.getName());
                    p.setDescription(product.getDescription());
                    p.setPrice(product.getPrice());

                    return productRepository.save(p);

                }).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }
}
