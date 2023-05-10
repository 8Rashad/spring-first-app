package com.example.firstspringapplication.controller;

import com.example.firstspringapplication.model.Product;
import com.example.firstspringapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    public List<Product> findAllProducts(){
        return service.getProducts();
    }
}
