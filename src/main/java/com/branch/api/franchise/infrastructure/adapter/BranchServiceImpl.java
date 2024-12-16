package com.branch.api.franchise.infrastructure.adapter;

import com.branch.api.franchise.application.service.BranchService;
import com.branch.api.franchise.domain.BranchDto;
import com.branch.api.franchise.infrastructure.repository.BranchRepository;
import com.branch.api.franchise.infrastructure.repository.entity.Branch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;


    @Override
    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    @Override
    public Branch getBranch(int id) throws RuntimeException {
        Branch branch = null;
        try{
            branch = branchRepository.findById(id).get();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        return branch;
    }

    @Override
    public Branch createBranch(BranchDto branchDto) {
        Branch branch = Branch.builder()
                .name(branchDto.getName())
                .franchise(branchDto.getFranchise())
                .build();
        return branchRepository.save(branch);
    }

    @Override
    public void deleteBranch(int id) {
        branchRepository.deleteById(id);
    }
}
