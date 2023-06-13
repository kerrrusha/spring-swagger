package com.kerrrusha.springswagger.repository;

import com.kerrrusha.springswagger.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
