package com.branch.api.franchise.domain;

import com.branch.api.franchise.infrastructure.repository.entity.Branch;
import com.branch.api.franchise.infrastructure.repository.entity.Product;
import lombok.Data;

@Data
public class ProductDto {

    private String name;
    private String description;
    private float price;
    private int amount;
    private Branch branch;
}
