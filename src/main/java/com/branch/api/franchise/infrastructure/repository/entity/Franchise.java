package com.branch.api.franchise.infrastructure.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "franquicia")
public class Franchise {
    @Id
    private int id;
    @Column(name = "nombre",unique = true, nullable = false)
    private String name;
    @Column(name = "sucursales")
    @OneToMany(mappedBy = "franquicia")
    private List<Branch> branches;

}
