package com.example.mewoofBCK.Controller;

import com.example.mewoofBCK.Entity.NecesidadesDinero;
import com.example.mewoofBCK.Repository.NecesidadDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("plata")
public class NecesidadDineroController {

    private final NecesidadDineroRepository necesidadDineroRepository;

    @Autowired
    public NecesidadDineroController(NecesidadDineroRepository necesidadDineroRepository){
        this.necesidadDineroRepository = necesidadDineroRepository;
    }

    @GetMapping
    public List<NecesidadesDinero> traerListaNecesidadDinero(){
        return necesidadDineroRepository.findAll();
    }

    @PostMapping
    public NecesidadesDinero crearNecesidadDinero(NecesidadesDinero necesidadDinero){
        return necesidadDineroRepository.save(necesidadDinero);
    }
}
