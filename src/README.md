# React-Typescript-Site-Atualizado-dos-Povos-Ind-genas-Sa-de-e-Plantas-Medicinais
Site com HTML e CSS e JAVASCRIPT e REACT e TYPESCRIPT

# 🌿 Povos Indígenas API

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring](https://img.shields.io/badge/SpringBoot-3.2-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![Docker](https://img.shields.io/badge/Docker-ready-blue)

API REST para o projeto:

**Povos Indígenas – Saúde, Plantas Medicinais e Saberes Tradicionais**

---

## 🚀 Tecnologias

Java  
Spring Boot  
JWT Authentication  
MySQL  
Docker  
Swagger  
AWS S3  

---

## 📊 Funcionalidades

✔ CRUD de plantas medicinais  
✔ Upload de imagens  
✔ Dashboard administrativo  
✔ API REST  
✔ Autenticação JWT  

---

## 🐳 Rodar com Docker

docker-compose up --build

---

## 📚 Documentação API

http://localhost:8080/swagger-ui.html

---

## 🧠 Diagrama de arquitetura profissional

                Frontend
          HTML / CSS / JS
                 │
                 ▼
          REST API (Spring Boot)
                 │
     ┌───────────┼───────────┐
     ▼           ▼           ▼
 Authentication  Upload     Dashboard
     │           │           │
     ▼           ▼           ▼
   JWT        AWS S3      Metrics
     │
     ▼
    MySQL
