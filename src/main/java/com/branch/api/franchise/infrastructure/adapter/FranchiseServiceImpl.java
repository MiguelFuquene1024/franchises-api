package com.branch.api.franchise.infrastructure.adapter;

import com.branch.api.franchise.application.service.FranchiseService;
import com.branch.api.franchise.domain.FranchiseDto;
import com.branch.api.franchise.infrastructure.repository.FranchiseRepository;
import com.branch.api.franchise.infrastructure.repository.entity.Franchise;

import java.util.List;

public class FranchiseServiceImpl implements FranchiseService {
    private FranchiseRepository franchiseRepository;
    @Override
    public List<Franchise> getFranchises() {
        return List.of();
    }

    @Override
    public Franchise getFranchise(int id) {
        return null;
    }

    @Override
    public Franchise createFranchise(FranchiseDto franchiseDto) {
        Franchise franchise = Franchise.builder()
                .name(franchiseDto.getName())
                .build();
        return franchiseRepository.save(franchise);
    }
}
