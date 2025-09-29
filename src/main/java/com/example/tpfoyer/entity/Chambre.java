package com.example.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
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


}
