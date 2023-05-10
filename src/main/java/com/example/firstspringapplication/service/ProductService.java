package com.example.firstspringapplication.service;

import com.example.firstspringapplication.model.Product;
import com.example.firstspringapplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts(){
        return repository.getAllProducts();
    }
}
