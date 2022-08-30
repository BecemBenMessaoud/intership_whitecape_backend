package com.whitecape.services;

import com.whitecape.entities.Category;

public interface CategoryService {
    Category addCategory(Category category);
    Category updateCategory (Category category,long categoryId);
    void deleteCategory (long categoryId);
}
