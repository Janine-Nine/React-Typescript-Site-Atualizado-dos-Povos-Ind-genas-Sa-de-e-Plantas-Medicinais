## 🌿 Povos Indígenas – Saúde e Plantas Medicinais ##

# React-Typescript-Site-Atualizado-dos-Povos-Ind-genas-Sa-de-e-Plantas-Medicinais
Site com HTML e CSS e JAVASCRIPT e REACT e TYPESCRIPT

# 🌿 Povos Indígenas API

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring](https://img.shields.io/badge/SpringBoot-3.2-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Docker](https://img.shields.io/badge/Docker-ready-blue)

API REST para o projeto:

**Povos Indígenas – Saúde, Plantas Medicinais e Saberes Tradicionais**

# Povos Indígenas API

API REST desenvolvida em Spring Boot para o projeto educacional
"Povos Indígenas – Saúde, Plantas Medicinais e Saberes Tradicionais".
Projeto educacional e cultural que documenta saberes tradicionais indígenas sobre saúde e plantas medicinais, utilizando uma arquitetura moderna de Frontend + API REST + Banco de Dados.

O sistema permite registrar, visualizar e administrar informações sobre plantas medicinais utilizadas por povos indígenas, preservando conhecimento tradicional em uma plataforma digital.

## 🚀 Tecnologias Utilizadas ##

Backend

Java 21

Spring Boot

Spring Security

JWT Authentication

Spring Data JPA

MySQL

Swagger / OpenAPI

Docker

Frontend

React

TypeScript

HTML5

CSS3

JavaScript

Axios

Cloud / Infraestrutura

AWS EC2

AWS S3 (upload de imagens)

AWS RDS (MySQL)

Docker

---

## 📊 Funcionalidades ##

✔ Cadastro de plantas medicinais
✔ CRUD completo (Create, Read, Update, Delete)
✔ Upload de imagens das plantas
✔ Painel administrativo
✔ Autenticação segura com JWT
✔ API REST documentada
✔ Formulário de contato
✔ Dashboard administrativo

---

## 🧠 Arquitetura do Sistema ##

Frontend
React + TypeScript
HTML / CSS / JS
       │
       │ REST API
       ▼
Spring Boot Backend
       │
 ┌───────────────┬───────────────┬───────────────┐
 ▼               ▼               ▼
Auth JWT      Upload Images     Dashboard
       │           │               │
       ▼           ▼               ▼
    Security      AWS S3        Metrics
       │
       ▼
     MySQL
       │
       ▼
     AWS Cloud

---

## 🏗️ Arquitetura em Camadas (Backend) ##


Controller
   │
Service
   │
Repository
   │
Database (MySQL)

---

## 🐳 Rodando o Projeto com Docker ##

docker-compose up --build

O Docker irá subir:

API Spring Boot

Banco MySQL

---

## Dependências necessárias ##

▶️ Rodar Backend Localmente
mvn spring-boot:run

Servidor iniciará em:

http://localhost:8080

---

## 📚 Documentação da API (Swagger) ##

Após iniciar o projeto:

http://localhost:8080/swagger-ui.html

---

## 📁 Estrutura do Projeto ##

povos-indigenas-api

src
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── dto
 └── config

frontend
 ├── components
 ├── pages
 ├── services
 └── styles

 ---
 
## 🌎 Objetivo do Projeto ##

O projeto busca:

preservar saberes tradicionais indígenas

registrar plantas medicinais e seus usos

promover educação cultural e científica

criar uma plataforma digital acessível

---

## 👩‍💻 Desenvolvido por ##

Janine – Desenvolvedora Full Stack em formação

Tecnologias focadas em:

Java

Spring Boot

React

TypeScript

APIs REST

Cloud Computing

##💡 Projeto educacional voltado para tecnologia, cultura e sustentabilidade. ##
