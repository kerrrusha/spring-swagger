package com.kerrrusha.springswagger.service;

import com.kerrrusha.springswagger.dto.request.PagedSortedDto;
import com.kerrrusha.springswagger.domain.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    Product get(Long id);

    void delete(Long id);

    Product update(Product newProduct);

    Page<Product> getAllPagedSorted(PagedSortedDto request);

    List<Product> getAllByPriceBetween(Long priceFrom, Long priceTo);

}
