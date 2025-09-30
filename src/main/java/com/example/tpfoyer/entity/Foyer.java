package com.example.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoer;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyer")
    private Set<Bloc> blocs;
    @OneToOne(cascade = CascadeType.ALL)
    private Universite universite;
}
