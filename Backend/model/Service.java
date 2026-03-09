package com.povosindigenas.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.povosindigenas.model.PlantaMedicinal;
import com.povosindigenas.repository.PlantaRepository;

@Service
public class PlantaService {

    @Autowired
    private PlantaRepository repository;

    public List<PlantaMedicinal> listar(){
        return repository.findAll();
    }

    public PlantaMedicinal salvar(PlantaMedicinal planta){
        return repository.save(planta);
    }
}