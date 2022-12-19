package com.geekbrains.zharko.hometask5;

import java.util.List;

public interface ProductsDao {

    Product findById(Long id);
    List<Product> findAll();
    void deleteById(Long id);
    void saveOrUpdate(Product product);
}
