package com.branch.api.franchise.infrastructure.repository;

import com.branch.api.franchise.infrastructure.repository.entity.Query;
import com.branch.api.franchise.infrastructure.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @org.springframework.data.jpa.repository.Query(value = "SELECT " +
            "new com.branch.api.franchise.infrastructure.repository.entity.Query(s.id, p.name, p.amount) "+
            "FROM Branch s JOIN Product p ON s.id = p.branch.id " +
            "WHERE s.franchise.id = :franchiseId AND p.amount = " +
            "(SELECT MAX(p2.amount) FROM Product p2 WHERE p2.branch.id = s.id)")
    List<Query> getMaxProductAmountByBranchesForOneFranchise(int franchiseId);
}
