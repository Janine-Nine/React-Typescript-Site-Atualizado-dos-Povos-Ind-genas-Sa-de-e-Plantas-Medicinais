package com.povosindigenas.service;

import com.povosindigenas.model.Contato;
import com.povosindigenas.repository.ContatoRepository;

import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    private final ContatoRepository repository;

    public ContatoService(ContatoRepository repository){
        this.repository = repository;
    }

    public Contato salvarContato(Contato contato){

        return repository.save(contato);

    }

}