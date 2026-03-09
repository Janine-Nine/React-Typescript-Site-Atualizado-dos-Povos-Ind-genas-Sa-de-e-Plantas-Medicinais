package com.povosindigenas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.povosindigenas.model.PlantaMedicinal;
import com.povosindigenas.service.PlantaService;

@RestController
@RequestMapping("/plantas")
@CrossOrigin("*")
public class PlantasController {

    @Autowired
    private PlantaService service;

    @GetMapping
    public List<PlantaMedicinal> listar(){
        return service.listar();
    }

    @PostMapping
    public PlantaMedicinal salvar(@RequestBody PlantaMedicinal planta){
        return service.salvar(planta);
    }
}