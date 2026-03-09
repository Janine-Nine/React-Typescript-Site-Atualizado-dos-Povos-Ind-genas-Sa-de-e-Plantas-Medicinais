package com.povosindigenas.model;

import jakarta.persistence.*;

@Entity
public class PlantaMedicinal {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;

private String descricao;

private String beneficios;

private String imagemUrl;

}