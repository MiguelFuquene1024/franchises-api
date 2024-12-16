package com.branch.api.franchise.application.service;

import com.branch.api.franchise.domain.ProductDto;
import com.branch.api.franchise.infrastructure.repository.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProduct(int id);
    Product createProduct(ProductDto productDto);
    void deleteProduct(int id);
}
