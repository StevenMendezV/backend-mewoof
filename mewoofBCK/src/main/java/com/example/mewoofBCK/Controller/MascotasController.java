package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.Mascotas;
import com.example.mewoofBCK.Service.MascotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mascotas")
public class MascotasController {

    private final MascotasService mascotasService;

    @Autowired
    public MascotasController(MascotasService mascotasService){
        this.mascotasService = mascotasService;
    }

    @GetMapping
    public List<Mascotas> traerListaMascotas(){
        return mascotasService.traerListaMascotas();
    }

    @GetMapping("/{id}")
    public Mascotas obtenerMascotaPorId(@PathVariable int id){
        return mascotasService.obtenerMascotaPorId(id);
    }

    @PostMapping("crearMascota")
    public Mascotas crearMascota(@RequestBody Mascotas mascota){
        return mascotasService.crearMascotas(mascota);
    }

    @PutMapping("/actualizarMascota")
    public Optional<Mascotas> actualizarMascota(Mascotas mascota){
        return mascotasService.actualizarMascota(mascota);
    }

    @DeleteMapping("eliminarMascota/{id}")
    public void eliminarMascota(@PathVariable int id){
        mascotasService.eliminarMascota(id);
    }

}
