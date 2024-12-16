package com.branch.api.franchise.application.service;

import com.branch.api.franchise.domain.BranchDto;
import com.branch.api.franchise.infrastructure.repository.entity.Branch;

import java.util.List;

public interface BranchService {
    List<Branch> getAllBranches();
    Branch getBranch(int id);
    Branch createBranch(BranchDto branchDto);
    void deleteBranch(int id);
}
