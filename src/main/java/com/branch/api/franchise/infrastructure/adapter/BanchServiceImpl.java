package com.branch.api.franchise.infrastructure.adapter;

import com.branch.api.franchise.application.service.BranchService;
import com.branch.api.franchise.domain.BranchDto;

import java.util.List;

public class BanchServiceImpl implements BranchService {

    @Override
    public List<BranchDto> getAllBranches() {
        return List.of();
    }

    @Override
    public BranchDto getBranch(String branchName) {
        return null;
    }

    @Override
    public BranchDto createBranch(BranchDto branchDto) {
        return null;
    }
}
