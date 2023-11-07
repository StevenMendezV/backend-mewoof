package com.example.mewoofBCK.Service;

import com.example.mewoofBCK.Entity.Mascotas;
import com.example.mewoofBCK.Entity.Usuarios;
import com.example.mewoofBCK.Repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class MascotasService {

    private MascotasRepository mascotasRepository;

    @Autowired
    public MascotasService(MascotasRepository mascotasRepository){
        this.mascotasRepository = mascotasRepository;
    }

    public List<Mascotas> traerListaMascotas(){
        return mascotasRepository.findAll();
    }

    public Mascotas obtenerMascotaPorId(@PathVariable int id){
        return mascotasRepository.findById(id).orElse(null);
    }

    public Mascotas crearMascotas(Mascotas mascota){
        return mascotasRepository.save(mascota);
    }

    public void eliminarMascota(int id){
        mascotasRepository.deleteById(id);
    }

    public Optional<Mascotas> actualizarMascota(Mascotas mascotaModificada){

        if (obtenerMascotaPorId(mascotaModificada.getId()) != null){

            return this.mascotasRepository.findById(mascotaModificada.getId()).map(mascotaActual -> {
                mascotaActual.setNombre(mascotaModificada.getNombre());
                mascotaActual.setEdad(mascotaModificada.getEdad());
                mascotaActual.setEspecie(mascotaModificada.getEspecie());
                mascotaActual.setRaza(mascotaModificada.getRaza());
                mascotaActual.setSize(mascotaModificada.getSize());
                mascotaActual.setUsuario(mascotaModificada.getUsuario());
                mascotaActual.setEstadoSalud(mascotaModificada.getEstadoSalud());
                mascotaActual.setEstadoAdopcion(mascotaModificada.getEstadoAdopcion());

                return mascotasRepository.save(mascotaActual);
            });
        } else {
            return null;
        }
    }



}
