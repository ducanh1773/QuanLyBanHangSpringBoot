package com.example.demo.services;

import com.example.demo.modal.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Boolean create (Category category);
    Category findById(Integer id);
    Boolean update(Category category);
    Boolean delete(Integer id);

}
