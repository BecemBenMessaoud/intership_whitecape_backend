package com.whitecape.services;

import com.whitecape.entities.Category;
import com.whitecape.reposities.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService{
    private final CategoryRepository categoryRepository;
    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category, long categoryId) {
        if (categoryRepository.findById(categoryId).isPresent()) {
            category.setId(categoryId);
            return categoryRepository.save(category);
        }
        return null;
    }

    @Override
    public void deleteCategory(long categoryId) {
        Optional <Category> category=categoryRepository.findById(categoryId);
         if (category.isPresent()){
           categoryRepository.delete(category.get());
         }
    }
}
