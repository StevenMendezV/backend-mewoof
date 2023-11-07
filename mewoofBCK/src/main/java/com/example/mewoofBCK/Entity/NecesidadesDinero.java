package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "necesidades_dinero")
public class NecesidadesDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_necesidad_dinero")
    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
}
