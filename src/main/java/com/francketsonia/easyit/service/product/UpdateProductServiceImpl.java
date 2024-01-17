package com.francketsonia.easyit.service.product;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateProductServiceImpl implements UpdateProductService {

    private final ProductRepository productRepository;

    @Override
    public Product update(Long productId, Product product) {
        return productRepository.findById(productId)
                .map(p -> {
                    p.setProduct_name(product.getProduct_name());
                    p.setDescription(product.getDescription());
                    p.setPrice(product.getPrice());
                    p.setCategory(product.getCategory());
                    p.setSupplier(product.getSupplier());

                    return productRepository.save(p);

                }).orElseThrow(() -> new RuntimeException("Produit non trouvé avec l'ID : " + productId));
    }
}
