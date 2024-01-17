package com.francketsonia.easyit.service.product;

import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteProductServiceImpl implements DeleteProductService{

    private final ProductRepository productRepository;
    @Override
    public String delete(Long productId) {
        productRepository.deleteById(productId);
        return "Produit supprimé avec succès";
    }

}
