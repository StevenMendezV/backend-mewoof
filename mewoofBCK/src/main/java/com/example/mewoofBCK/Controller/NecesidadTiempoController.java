package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.NecesidadesTiempo;
import com.example.mewoofBCK.Repository.NecesidadTiempoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tiempo")
public class NecesidadTiempoController {

    private final NecesidadTiempoRepository necesidadTiempoRepository;

    @Autowired
    public NecesidadTiempoController(NecesidadTiempoRepository necesidadTiempoRepository){
        this.necesidadTiempoRepository = necesidadTiempoRepository;
    }

    @GetMapping
    public List<NecesidadesTiempo> traerListaNecesidadTiempo(){
        return necesidadTiempoRepository.findAll();
    }

    @PostMapping
    public NecesidadesTiempo crearNecesidadTiempo(NecesidadesTiempo necesidadTiempo){
        return necesidadTiempoRepository.save(necesidadTiempo);
    }
}
