package com.povosindigenas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.povosindigenas.model.PlantaMedicinal;
import com.povosindigenas.service.PlantaService;

@RestController
@RequestMapping("/plantas")
@CrossOrigin("*")
public class PlantasController {

private final PlantaService service;

public PlantasController(PlantaService service){
this.service = service;
}

@GetMapping
public List<PlantaMedicinal> listar(){
return service.listar();
}

@PostMapping
public PlantaMedicinal criar(@RequestBody PlantaMedicinal planta){
return service.salvar(planta);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id){
service.deletar(id);
}

}