package com.branch.api.franchise.infrastructure.repository.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Query {
    private int sucursal_id;
    private String producto;
    private int cantidad;
}
