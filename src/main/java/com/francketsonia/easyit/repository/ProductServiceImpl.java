package com.francketsonia.easyit.repository;

import com.francketsonia.easyit.model.Product;
import com.francketsonia.easyit.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> read() {
        return productRepository.findAll();
    }

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

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Produit supprimé avec succès";
    }

}
