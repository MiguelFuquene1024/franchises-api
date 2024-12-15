package com.branch.api.franchise.infrastructure.repository;

import com.branch.api.franchise.infrastructure.repository.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
