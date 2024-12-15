package com.branch.api.franchise.infrastructure.repository;

import com.branch.api.franchise.infrastructure.repository.entity.Franchise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchiseRepository extends CrudRepository<Franchise,Integer> {
}