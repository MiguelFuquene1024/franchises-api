package com.branch.api.franchise.infrastructure.adapter;

import com.branch.api.franchise.application.service.ProductService;
import com.branch.api.franchise.domain.ProductDto;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductDto getProduct(int id) {
        return null;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        return null;
    }
}
