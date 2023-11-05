package com.example.mewoofBCK.Service;

import com.example.mewoofBCK.Entity.Usuarios;
import com.example.mewoofBCK.Repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {
    private final UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosService(UsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuarios> obtenerUsuarios(){

        return usuariosRepository.findAll();
    }

    public Usuarios obtenerUsuarioPorId(int id){
        return usuariosRepository.findById(id).orElse(null);
    }

    public Usuarios obtenerUsuarioPorEmail(String email){
        return usuariosRepository.findByEmail(email);
    }

    public Usuarios crearUsuario(Usuarios usuario){
        return usuariosRepository.save(usuario);
    }

    public void eliminarUsuario(int id){
        usuariosRepository.deleteById(id);
    }

    public Optional<Usuarios> actualizarUsuario(Usuarios usuarioModificado){

        if (obtenerUsuarioPorId(usuarioModificado.getId()) != null){

            return this.usuariosRepository.findById(usuarioModificado.getId()).map(personaActual -> {
                personaActual.setNombre(usuarioModificado.getNombre());
                personaActual.setApellido(usuarioModificado.getApellido());
                personaActual.setTelefono(usuarioModificado.getTelefono());
                personaActual.setPais(usuarioModificado.getPais());
                personaActual.setCiudad(usuarioModificado.getCiudad());
                personaActual.setEmail(usuarioModificado.getEmail());
                personaActual.setAbout(usuarioModificado.getAbout());
                personaActual.setTipo(usuarioModificado.getTipo());

                return usuariosRepository.save(personaActual);
                });
        } else {
            return null;
        }
    }
}
