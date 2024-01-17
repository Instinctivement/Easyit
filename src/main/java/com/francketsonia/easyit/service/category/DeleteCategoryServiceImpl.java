package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteCategoryServiceImpl implements DeleteCategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public String deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
        return "Category supprimé avec succès";
    }

}
