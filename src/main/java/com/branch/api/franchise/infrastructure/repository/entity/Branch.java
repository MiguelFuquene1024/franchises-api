package com.branch.api.franchise.infrastructure.repository.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Entity
@Table(name = "sucursal")
@Data
public class Branch {
    @Id
    private int id;
    @Column(name = "nombre")
    private String name;
    @ManyToOne
    @JoinColumn(name = "franchise_id")
    private Franchise franchise;
    @Column(name = "productos")
    @OneToMany(mappedBy = "branch")
    private List<Product> products;
}
