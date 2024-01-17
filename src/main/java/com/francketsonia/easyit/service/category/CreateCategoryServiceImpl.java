package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.model.Category;
import com.francketsonia.easyit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCategoryServiceImpl implements CreateCategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
