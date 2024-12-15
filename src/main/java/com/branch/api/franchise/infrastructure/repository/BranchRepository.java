package com.branch.api.franchise.infrastructure.repository;

import com.branch.api.franchise.infrastructure.repository.entity.Branch;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepository extends CrudRepository<Branch, Integer> {
}
