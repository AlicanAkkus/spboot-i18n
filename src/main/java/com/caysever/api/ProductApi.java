package com.caysever.api;

import com.caysever.model.Product;
import com.caysever.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alican on 01.05.2017.
 */
@RestController
@RequestMapping("/api/product")
public class ProductApi {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> findAllProduct(){
        return productService.findAllProduct();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public List<Product> find(@PathVariable("name") String name){
        return productService.findProductByName(name);
    }

}
