package com.povosindigenas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.povosindigenas.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}