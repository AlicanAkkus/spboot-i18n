package com.caysever.service.impl;

import com.caysever.model.Product;
import com.caysever.repository.ProductRepository;
import com.caysever.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created by alican on 01.05.2017.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findProductById(Long id) {
        return Optional.ofNullable(productRepository.findOne(id));
    }

    @Override
    public List<Product> findProductByName(String name) {
        return productRepository.findProductByName(name);
    }

    @Override
    public List<Product> findProductByPriceBetween(BigDecimal firstPrice, BigDecimal secondPrice) {
        return productRepository.findProductByPriceBetween(firstPrice, secondPrice);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        return Optional.ofNullable(productRepository.findOne(id));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.delete(id);
    }
}
