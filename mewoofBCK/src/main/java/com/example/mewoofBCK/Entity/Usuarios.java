package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Usuario")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "ID_Pais") // Nombre de la columna en la tabla de Usuarios que almacena la clave foránea a la tabla de Pais
    private Paises pais;
    @ManyToOne
    @JoinColumn(name = "ID_Ciudad")
    private Ciudades ciudad;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Email")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @ManyToOne
    @JoinColumn(name = "ID_Tipo") // Nombre de la columna en la tabla de Usuarios que almacena la clave foránea a la tabla de Pais
    private Tipos tipo;
    @Column(name = "About")
    private String about;
}
