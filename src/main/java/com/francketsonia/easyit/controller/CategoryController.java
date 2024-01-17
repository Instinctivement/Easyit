package com.francketsonia.easyit.controller;

import com.francketsonia.easyit.model.Category;
import com.francketsonia.easyit.service.category.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
@Tag(name = "category")
public class CategoryController {

    private final CreateCategoryService createCategoryService;
    private final DeleteCategoryService deleteCategoryService;
    private final GetCategoryByIdService getCategoryByIdService;
    private final ReadCategoryService readCategoryService;
    private final UpdateCategoryService updateCategoryService;

    @Operation(summary = "Create a new category", description = "Create a new category")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return createCategoryService.saveCategory(category);
    }

    @Operation(summary = "Get category list", description = "Get all category")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read")
    public List<Category> read(){
        return readCategoryService.getAllCategories();
    }

    @Operation(summary = "Get one category", description = "Get one category by id")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @GetMapping("/read/{id}")
    public Category readById(@PathVariable Long id){
        return getCategoryByIdService.getCategoryById(id);
    }

    @Operation(summary = "Modify a category", description = "Modify a category")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @PutMapping("/update/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category category){
        return updateCategoryService.updateCategory(id, category);
    }

    @Operation(summary = "Delete a user", description = "Delete a user")
    @ApiResponse(responseCode = "200", description = "Successfull operation")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return deleteCategoryService.deleteCategory(id);
    }

}
