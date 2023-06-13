package com.kerrrusha.springswagger.repository;

import com.kerrrusha.springswagger.domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductPagingSortingRepository extends PagingAndSortingRepository<Product, Long> {
}
