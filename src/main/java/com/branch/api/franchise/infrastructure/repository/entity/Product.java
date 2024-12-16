package com.branch.api.franchise.infrastructure.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "precio")
    private float price;
    @Column(name = "cantidad")
    private int amount;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "branch_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Branch branch;

}
