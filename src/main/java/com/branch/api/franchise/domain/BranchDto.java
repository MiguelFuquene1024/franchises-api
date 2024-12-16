package com.branch.api.franchise.domain;

import com.branch.api.franchise.infrastructure.repository.entity.Franchise;
import com.branch.api.franchise.infrastructure.repository.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class BranchDto {
    private String name;
    private Franchise franchise;
}
