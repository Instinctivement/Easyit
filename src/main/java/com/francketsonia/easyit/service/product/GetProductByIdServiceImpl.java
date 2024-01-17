package com.francketsonia.easyit.service.product;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetProductByIdServiceImpl implements GetProductByIdService {

    private final ProductRepository productRepository;
    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Produit non trouvé avec l'ID : " + productId));
    }

}
