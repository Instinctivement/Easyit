package com.francketsonia.easyit.repository;

import com.francketsonia.easyit.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
