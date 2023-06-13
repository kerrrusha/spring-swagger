package com.kerrrusha.springswagger.service.mapper;

import com.kerrrusha.springswagger.dto.request.ProductRequestDto;
import com.kerrrusha.springswagger.dto.response.ProductResponseDto;
import com.kerrrusha.springswagger.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements RequestDtoMapper<ProductRequestDto, Product>, ResponseDtoMapper<ProductResponseDto, Product> {

    @Override
    public Product mapToModel(ProductRequestDto dto) {
        Product product = new Product();
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        return product;
    }

    @Override
    public ProductResponseDto mapToDto(Product product) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(product.getId());
        dto.setTitle(product.getTitle());
        dto.setPrice(product.getPrice());
        return dto;
    }

}
