package com.example.mewoofBCK.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "necesidades_espacio")
public class NecesidadesEspacio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NecesidadEspacio")
    private Integer id;
    @Column(name = "Descripcion")
    private String descripcion;
}
