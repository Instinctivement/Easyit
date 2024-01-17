package com.francketsonia.easyit.repository;

import com.francketsonia.easyit.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
