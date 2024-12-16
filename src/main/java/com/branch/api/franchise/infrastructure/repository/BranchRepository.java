package com.branch.api.franchise.infrastructure.repository;

import com.branch.api.franchise.infrastructure.repository.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
