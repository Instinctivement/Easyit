package com.francketsonia.easyit.service.category;

import com.francketsonia.easyit.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteCategoryServiceImpl {

    private final CategoryRepository categoryRepository;
}
