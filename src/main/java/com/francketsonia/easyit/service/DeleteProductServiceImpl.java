package com.francketsonia.easyit.service;

import com.francketsonia.easyit.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteProductServiceImpl implements DeleteProductService{

    private final ProductRepository productRepository;
    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Produit supprimé avec succès";
    }

}
