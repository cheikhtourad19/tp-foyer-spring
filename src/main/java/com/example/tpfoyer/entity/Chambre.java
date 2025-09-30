package com.example.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numerochambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne()
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "chambre")
    private Set<Reservation> reservation;



}
