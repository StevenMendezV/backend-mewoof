package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "razas")
public class Razas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Raza")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "ID_Especie")
    private Especies especie;
    @Column(name = "Raza")
    private String raza;
    @OneToOne
    @JoinColumn(name = "ID_NecesidadEspacio")
    private NecesidadesEspacio necesidadEspacio;
}
