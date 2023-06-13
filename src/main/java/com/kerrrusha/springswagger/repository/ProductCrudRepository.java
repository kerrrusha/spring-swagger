package com.kerrrusha.springswagger.repository;

import com.kerrrusha.springswagger.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Long> {

    List<Product> findByPriceBetween(Long priceStart, Long priceEnd);

}
