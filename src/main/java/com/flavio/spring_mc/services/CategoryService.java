package com.flavio.spring_mc.services;

import com.flavio.spring_mc.entities.models.Category;
import com.flavio.spring_mc.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category insertCategory(Category cat){
        return categoryRepository.save(cat);
    }

    public Category findById(Integer id){
        Optional<Category> catOpt = categoryRepository.findById(id);
        return new Category(catOpt.get().getId(), catOpt.get().getName());

    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
