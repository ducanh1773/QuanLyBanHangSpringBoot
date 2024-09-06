package com.example.demo.services;

import com.example.demo.modal.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Boolean create(Product product) {
        return null;
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public Boolean update(Product product) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }
}
