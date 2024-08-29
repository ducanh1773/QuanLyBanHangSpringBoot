package com.example.demo.repository;


import com.example.demo.modal.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Category , Integer> {

}
