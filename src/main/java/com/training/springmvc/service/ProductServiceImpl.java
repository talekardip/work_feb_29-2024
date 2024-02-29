package com.training.springmvc.service;


import com.training.springmvc.dao.ProductDAO;
import com.training.springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDAO productDao;
    @Override
    public List<Product> getAllProducts(){
        List<Product> prodList = productDao.getAllProducts();
//        List<Product> prodList = new ArrayList<>();
//        prodList.add(new Product(101,"Laptop","Electronics",2000));
        return prodList;
    }

    public void insertProduct(Product product){
        productDao.insertProduct(product);
    }
}
