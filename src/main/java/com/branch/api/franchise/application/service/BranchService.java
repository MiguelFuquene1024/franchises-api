package com.branch.api.franchise.application.service;

import com.branch.api.franchise.domain.BranchDto;

import java.util.List;

public interface BranchService {
    List<BranchDto> getAllBranches();
    BranchDto getBranch(String branchName);
    BranchDto createBranch(BranchDto branch);
}
