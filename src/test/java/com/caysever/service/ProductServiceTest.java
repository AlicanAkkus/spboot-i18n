package com.caysever.service;

import com.caysever.model.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by alican on 01.05.2017.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

   @Autowired
   ProductService productService;

    @Before
    public void setup(){
    }

    @Test
    public void saveProducts(){
        Product product = new Product(2L, "Axon7", "Axon 7 4/64GB", BigDecimal.valueOf(2399.99), 100L);
        productService.saveProduct(product);
    }

    @Test
    public void fetchProducts(){
        productService.findAllProduct().forEach(System.out::println);
    }
}
