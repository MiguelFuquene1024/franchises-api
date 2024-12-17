package com.branch.api.franchise.infrastructure.adapter;

import com.branch.api.franchise.application.service.ProductService;
import com.branch.api.franchise.domain.ProductDto;
import com.branch.api.franchise.infrastructure.repository.entity.Query;
import com.branch.api.franchise.infrastructure.repository.ProductRepository;
import com.branch.api.franchise.infrastructure.repository.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public Product getProduct(int id) {
        Product product = null;
        try {
            product = productRepository.findById(id).get();
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return product;
    }

    @Override
    public Product createProduct(ProductDto productDto) {
        Product product = Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .amount(productDto.getAmount())
                .branch(productDto.getBranch()).build();
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(int id,ProductDto productDto) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            product.get().setAmount(productDto.getAmount());
            return productRepository.save(product.get());
        }else {
            throw new RuntimeException("Product not found");
        }
    }


    @Override
    public void deleteProduct(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            productRepository.delete(product.get());
        }else {
            throw new RuntimeException("Product not found");
        }
    }

    @Override
    public List<Query> getQueryMaxProductAmount(int id) {
        return productRepository.getMaxProductAmountByBranchesForOneFranchise(id);
    }
}
