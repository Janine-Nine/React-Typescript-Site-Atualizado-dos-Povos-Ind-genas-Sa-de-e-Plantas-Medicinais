package com.povosindigenas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.povosindigenas.model.PlantaMedicinal;

public interface PlantaRepository extends JpaRepository<PlantaMedicinal, Long> {

}