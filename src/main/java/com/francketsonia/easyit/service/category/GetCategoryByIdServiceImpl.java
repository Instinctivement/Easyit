package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.model.Category;
import com.francketsonia.easyit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetCategoryByIdServiceImpl implements GetCategoryByIdService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("Catégorie non trouvée avec l'ID : " + categoryId));
    }
}
