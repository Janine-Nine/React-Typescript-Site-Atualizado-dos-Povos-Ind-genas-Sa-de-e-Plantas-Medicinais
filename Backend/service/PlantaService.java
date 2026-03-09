package com.povosindigenas.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.povosindigenas.model.PlantaMedicinal;
import com.povosindigenas.repository.PlantaRepository;

@Service
public class PlantaService {

private final PlantaRepository repository;

public PlantaService(PlantaRepository repository){
this.repository = repository;
}

public List<PlantaMedicinal> listar(){
return repository.findAll();
}

public PlantaMedicinal salvar(PlantaMedicinal planta){
return repository.save(planta);
}

public void deletar(Long id){
repository.deleteById(id);
}

}