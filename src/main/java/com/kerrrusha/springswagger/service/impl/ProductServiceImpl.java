package com.kerrrusha.springswagger.service.impl;

import com.kerrrusha.springswagger.dto.PagedSortedDto;
import com.kerrrusha.springswagger.model.Product;
import com.kerrrusha.springswagger.repository.ProductRepository;
import com.kerrrusha.springswagger.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public Product get(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product update(Product newProduct) {
        return null;
    }

    @Override
    public List<Product> getAllPagedSorted(PagedSortedDto request) {
        return null;
    }

    @Override
    public List<Product> getAllByPriceBetween(Long priceFrom, Long priceTo) {
        return null;
    }

}
