package com.caysever.service;

import com.caysever.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created by alican on 01.05.2017.
 */
public interface ProductService  {

    Product saveProduct(Product product);
    Product updateProduct(Product product);
    Optional<Product> getProduct(Long id);
    void deleteProduct(Long id);

    List<Product> findAllProduct();
    Optional<Product> findProductById(Long id);
    List<Product> findProductByName(String name);
    List<Product> findProductByPriceBetween(BigDecimal firstPrice, BigDecimal secondPrice);

}

