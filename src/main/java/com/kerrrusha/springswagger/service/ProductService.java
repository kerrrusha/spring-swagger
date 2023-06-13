package com.kerrrusha.springswagger.service;

import com.kerrrusha.springswagger.dto.PagedSortedDto;
import com.kerrrusha.springswagger.model.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    Product get(Long id);

    void delete(Long id);

    Product update(Product newProduct);

    List<Product> getAllPagedSorted(PagedSortedDto request);

    List<Product> getAllByPriceBetween(Long priceFrom, Long priceTo);

}
