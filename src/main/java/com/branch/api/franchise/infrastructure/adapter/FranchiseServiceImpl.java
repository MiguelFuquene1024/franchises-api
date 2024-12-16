package com.branch.api.franchise.infrastructure.adapter;

import com.branch.api.franchise.application.service.FranchiseService;
import com.branch.api.franchise.domain.FranchiseDto;
import com.branch.api.franchise.infrastructure.repository.FranchiseRepository;
import com.branch.api.franchise.infrastructure.repository.entity.Franchise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FranchiseServiceImpl implements FranchiseService {
    private final FranchiseRepository franchiseRepository;
    @Override
    public List<Franchise> getFranchises() {

        return franchiseRepository.findAll();
    }

    @Override
    public Franchise getFranchise(int id) {
        Franchise franchise = null;
        try {
            franchise = franchiseRepository.findById(id).get();
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return franchise;
    }

    @Override
    public Franchise createFranchise(FranchiseDto franchiseDto) {
        Franchise franchise = Franchise.builder()
                .name(franchiseDto.getName())
                .build();
        return franchiseRepository.save(franchise);
    }

    @Override
    public void deleteFranchise(int id) {
        Optional<Franchise> franchise = franchiseRepository.findById(id);
        if (franchise.isPresent()) {
            franchiseRepository.delete(franchise.get());
        }else {
            throw new RuntimeException("Franchise not found");
        }

    }
}
