package com.kerrrusha.springswagger.service.impl;

import com.kerrrusha.springswagger.dto.request.PagedSortedDto;
import com.kerrrusha.springswagger.domain.Product;
import com.kerrrusha.springswagger.repository.ProductCrudRepository;
import com.kerrrusha.springswagger.repository.ProductPagingSortingRepository;
import com.kerrrusha.springswagger.service.ProductService;
import com.kerrrusha.springswagger.service.mapper.PageableMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductCrudRepository productCrudRepository;
    private final ProductPagingSortingRepository productPagingSortingRepository;
    private final PageableMapper pageableMapper;

    @Override
    public Product create(Product product) {
        return productCrudRepository.save(product);
    }

    @Override
    public Product get(Long id) {
        return productCrudRepository.findById(id)
                .orElseThrow(() -> createProductNotFoundException(id));
    }

    @Override
    public void delete(Long id) {
        productCrudRepository.deleteById(id);
    }

    @Override
    public Product update(Product newProduct) {
        Product existingProduct = productCrudRepository.findById(newProduct.getId())
                .orElseThrow(() -> createProductNotFoundException(newProduct.getId()));

        existingProduct.setTitle(newProduct.getTitle());
        existingProduct.setPrice(newProduct.getPrice());

        return productCrudRepository.save(existingProduct);
    }

    @Override
    public Page<Product> getAllPagedSorted(PagedSortedDto request) {
        Pageable pageable = pageableMapper.mapToModel(request);
        return productPagingSortingRepository.findAll(pageable);
    }

    @Override
    public List<Product> getAllByPriceBetween(Long priceStart, Long priceEnd) {
        return productCrudRepository.findByPriceBetween(priceStart, priceEnd);
    }

    private EntityNotFoundException createProductNotFoundException(Long id) {
        return new EntityNotFoundException("Product not found by id " + id);
    }

}
