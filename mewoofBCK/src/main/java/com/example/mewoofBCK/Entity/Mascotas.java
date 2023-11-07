package com.example.mewoofBCK.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "mascotas")
public class Mascotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Mascota")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Edad")
    private Integer edad;
    @OneToOne
    @JoinColumn(name = "ID_Especie")
    private Especies especie;
    @OneToOne
    @JoinColumn(name = "ID_Raza")
    private Razas raza;
    @OneToOne
    @JoinColumn(name = "ID_Size")
    private Sizes size;
    @ManyToOne
    @JoinColumn(name = "ID_Usuario")
    private Usuarios usuario;
    @OneToOne
    @JoinColumn(name = "ID_Estado_Salud")
    private EstadosSalud estadoSalud;
    @OneToOne
    @JoinColumn(name = "ID_Estado_Adopcion")
    private EstadosAdopcion estadoAdopcion;
    @OneToOne
    @JoinColumn(name = "id_necesidad_dinero")
    private NecesidadesDinero necesidadDinero;
    @OneToOne
    @JoinColumn(name = "id_necesidad_tiempo")
    private NecesidadesTiempo necesidadTiempo;
}
