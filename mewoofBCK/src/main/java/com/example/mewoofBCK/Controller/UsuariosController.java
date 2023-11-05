package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.Usuarios;
import com.example.mewoofBCK.Service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public List<Usuarios> obtenerUsuarios(){
        return usuariosService.obtenerUsuarios();
    }

    @GetMapping("/{id}")
    public Usuarios obtenerUsuarioPorId(@PathVariable int id){
        return usuariosService.obtenerUsuarioPorId(id);
    }

    @GetMapping("/email")
    public Usuarios obtenerUsuarioPorEmail(@RequestParam("email") String email){
        return usuariosService.obtenerUsuarioPorEmail(email);
    }

    @PostMapping("crearUsuario")
    public Usuarios crearUsuario(@RequestBody Usuarios usuario){
        return usuariosService.crearUsuario(usuario);
    }

    @PutMapping("actualizarUsuario")
    public Optional<Usuarios> actualizarUsuario(@RequestBody Usuarios usuarioModificado){
        return usuariosService.actualizarUsuario(usuarioModificado);
    }

    @DeleteMapping("eliminarUsuario/{id}")
    public void eliminarUsuario(@PathVariable int id){
        usuariosService.eliminarUsuario(id);
    }
}
