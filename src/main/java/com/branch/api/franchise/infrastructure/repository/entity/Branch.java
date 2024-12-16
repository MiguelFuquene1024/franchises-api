package com.branch.api.franchise.infrastructure.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sucursal")
@Data
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String name;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "franchise_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Franchise franchise;
    @Column(name = "productos")
    @OneToMany(mappedBy = "branch")
    private List<Product> products;
}
