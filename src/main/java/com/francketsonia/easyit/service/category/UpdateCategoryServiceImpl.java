package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.model.Category;
import com.francketsonia.easyit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateCategoryServiceImpl implements UpdateCategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category updateCategory(Long categoryId, Category updatedCategory) {
        return categoryRepository.findById(categoryId)
                .map(existingCategory -> {
                    existingCategory.setCategory_name(updatedCategory.getCategory_name());

                    return categoryRepository.save(existingCategory);
                })
                .orElseThrow(() -> new RuntimeException("Catégorie non trouvée avec l'ID : " + categoryId));
    }

}
