package com.example.mewoofBCK.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class NecesidadesEspacio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NecesidadEspacio")
    private Integer id;
    @Column(name = "Descripcion")
    private String descripcion;
}
