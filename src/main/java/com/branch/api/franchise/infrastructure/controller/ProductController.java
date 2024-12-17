package com.branch.api.franchise.infrastructure.controller;

import com.branch.api.franchise.application.service.FranchiseService;
import com.branch.api.franchise.domain.FranchiseDto;
import com.branch.api.franchise.domain.ProductDto;
import com.branch.api.franchise.infrastructure.adapter.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductServiceImpl productService;

    @GetMapping
    public ResponseEntity<?> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable int id) {
        return ResponseEntity.ok(productService.getProduct(id));
    }
    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.createProduct(productDto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable int id ,@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.updateProduct(id, productDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
    @GetMapping("/getQuery/{id}")
    public ResponseEntity<?> getProductQuery(@PathVariable int id) {
        return ResponseEntity.ok(productService.getQueryMaxProductAmount(id));
    }
}
