package com.training.springmvc.dao;

import com.training.springmvc.model.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> getAllProducts();
    public void insertProduct(Product prod);
}
