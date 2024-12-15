package com.branch.api.franchise.application.service;

import com.branch.api.franchise.domain.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProducts();
    ProductDto getProduct(int id);
    ProductDto createProduct(ProductDto productDto);
}
