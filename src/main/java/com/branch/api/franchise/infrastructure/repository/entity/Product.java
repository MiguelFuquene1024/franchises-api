package com.branch.api.franchise.infrastructure.repository.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Builder
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
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
