package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.model.Category;
import com.francketsonia.easyit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadCategoryServiceImpl implements ReadCategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
