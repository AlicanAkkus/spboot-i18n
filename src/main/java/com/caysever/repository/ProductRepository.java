package com.caysever.repository;

import com.caysever.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created by alican on 01.05.2017.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findProductByName(String name);
    List<Product> findProductByPriceBetween(BigDecimal firstPrice, BigDecimal secondPrice);

}
