package com.kerrrusha.springswagger.controller;

import com.kerrrusha.springswagger.dto.request.PagedSortedDto;
import com.kerrrusha.springswagger.dto.request.ProductRequestDto;
import com.kerrrusha.springswagger.dto.response.ProductResponseDto;
import com.kerrrusha.springswagger.domain.Product;
import com.kerrrusha.springswagger.service.ProductService;
import com.kerrrusha.springswagger.service.mapper.RequestDtoMapper;
import com.kerrrusha.springswagger.service.mapper.ResponseDtoMapper;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final RequestDtoMapper<ProductRequestDto, Product> productRequestDtoMapper;
    private final ResponseDtoMapper<ProductResponseDto, Product> productResponseDtoMapper;

    @PostMapping("/")
    @ApiOperation(value = "Create new product")
    public ProductResponseDto add(@RequestBody ProductRequestDto requestDto) {
        Product product = productService.create(productRequestDtoMapper.mapToModel(requestDto));
        return productResponseDtoMapper.mapToDto(product);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get a product by id")
    public ProductResponseDto get(@PathVariable Long id) {
        Product product = productService.get(id);
        return productResponseDtoMapper.mapToDto(product);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update a product")
    public ProductResponseDto update(@PathVariable Long id, @RequestBody ProductRequestDto requestDto) {
        Product product = productService.update(productRequestDtoMapper.mapToModel(requestDto));
        product.setId(id);
        return productResponseDtoMapper.mapToDto(product);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a product by id")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

    @PostMapping("/pagedsorted")
    @ApiOperation(value = "Get products paged and sorted")
    public List<Product> getAllPagedSorted(@RequestBody PagedSortedDto requestDto) {
        return productService.getAllPagedSorted(requestDto).getContent();
    }

    @GetMapping("/pricebetween")
    @ApiOperation(value = "Get products by price between")
    public List<Product> getAllPriceBetween(@RequestParam("priceFrom") Long priceFrom, @RequestParam("priceTo") Long priceTo) {
        return productService.getAllByPriceBetween(priceFrom, priceTo);
    }

}
