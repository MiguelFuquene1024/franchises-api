package com.branch.api.franchise.application.service;

import com.branch.api.franchise.domain.FranchiseDto;
import com.branch.api.franchise.infrastructure.repository.entity.Franchise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FranchiseService {

    List<Franchise> getFranchises();
    Franchise getFranchise(int id);
    Franchise createFranchise(FranchiseDto franchise);
}
