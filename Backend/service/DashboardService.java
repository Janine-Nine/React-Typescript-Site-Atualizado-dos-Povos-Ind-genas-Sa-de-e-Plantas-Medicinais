package com.povosindigenas.service;

import com.povosindigenas.repository.PlantaRepository;
import com.povosindigenas.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardService {

    private final PlantaRepository plantaRepository;
    private final UsuarioRepository usuarioRepository;

    public DashboardService(PlantaRepository plantaRepository,
                            UsuarioRepository usuarioRepository){

        this.plantaRepository = plantaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Map<String,Object> obterEstatisticas(){

        Map<String,Object> stats = new HashMap<>();

        stats.put("totalPlantas", plantaRepository.count());
        stats.put("totalUsuarios", usuarioRepository.count());

        return stats;
    }

}