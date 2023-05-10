package com.example.firstspringapplication.repository;

import com.example.firstspringapplication.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> list = new ArrayList<Product>();

    public void createProducts(){
        list = List.of(
                new Product("Item 1", 3, 30.0),
                new Product("Item 2", 5, 50.0),
                new Product("Item 3", 8, 80.0)
        );
    }

    public List<Product> getAllProducts(){
        return list;
    }
}
