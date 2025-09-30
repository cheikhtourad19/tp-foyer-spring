package com.example.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date anneUnniversitaire;
    private boolean estValide;
    @ManyToOne()
    private Chambre chambre;
    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;
}
