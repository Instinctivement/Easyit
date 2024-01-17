package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.model.Category;

public interface UpdateCategoryService {

    Category updateCategory(Long categoryId, Category updatedCategory);

}
