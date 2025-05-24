# 🐾 Pet Shop - Sistema de Gerenciamento de Animais de Estimação

Este projeto é uma aplicação Web completa que implementa uma **API REST com Spring Boot** e um **front-end HTML/JavaScript** para gerenciar dados de animais de estimação em um Pet Shop.

---

## 🎥 Demonstração em Vídeo

Acesse o vídeo abaixo para ver uma demonstração completa do sistema funcionando:

[![Assista ao vídeo](video-thumbnail.jpg)](link-para-o-video.mp4)

---

## 🔧 Funcionalidades da Interface Web

A interface web foi desenvolvida em HTML + JavaScript puro, e permite realizar todas as operações CRUD:

### 1. Listar Animais

* Ao carregar a página, todos os animais cadastrados na API são exibidos em uma tabela.
* Os dados são obtidos por meio de uma requisição `GET` para `http://localhost:8080/pets`.

### 2. Adicionar um Novo Animal

* O formulário permite inserir:

  * Nome
  * Tipo (ex: cachorro, gato)
  * Raça
  * Idade
  * Nome do Dono
* Ao clicar em **Salvar**, uma requisição `POST` é enviada para a API com os dados.

### 3. Editar Animal

* Cada linha da tabela possui um botão **Editar**.
* Ao clicar, os dados do animal são carregados no formulário para edição.
* Ao salvar novamente, é enviada uma requisição `PUT` para atualizar os dados.

### 4. Excluir Animal

* Cada linha também possui um botão **Excluir**.
* Ao clicar, é exibido um alerta de confirmação.
* Se confirmado, é enviada uma requisição `DELETE` para a API.

### 5. Conexão com API

* A interface se comunica com a API usando `fetch()`.
* O backend deve estar rodando localmente em `http://localhost:8080`.

---

## 💾 Backend Spring Boot

A aplicação backend implementa:

* Entidade: `Pet` (com id, nome, tipo, raça, idade, dono)
* Repositório JPA para persistência dos dados
* Controller REST com os seguintes endpoints:

  * `GET /pets` → listar todos
  * `POST /pets` → adicionar novo
  * `PUT /pets/{id}` → editar existente
  * `DELETE /pets/{id}` → remover
* Permissão CORS ativada via `@CrossOrigin(origins = "*")`

---

## 🚀 Como Executar

### 1. Iniciar o backend

No diretório do projeto Spring Boot:

```bash
mvn spring-boot:run
```

Ou:

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### 2. Iniciar a interface (front-end)

* Use VS Code + extensão Live Server, ou:

```bash
cd frontend
python -m http.server 5500
```

* Acesse: `http://localhost:5500/index.html`

---

## 📆 Estrutura do Projeto

```
petshop/
├── src/main/java/com/example/demo/
│   ├── Pet.java
│   ├── PetController.java
│   ├── PetRepository.java
│   ├── PetNotFoundException.java
│   ├── PetNotFoundAdvice.java
│   └── LoadDatabase.java
├── src/main/resources/application.properties
├── pom.xml
└── frontend/
    └── index.html
```

---

## ✅ Requisitos Atendidos

* API REST seguindo o modelo de maturidade de Richardson
* Persistência de dados com Spring Data JPA
* Interface que consome a API com GET, POST, PUT e DELETE
* Testes via navegador e Postman
* Código pronto para entrega e deploy

---

## 📋 Autor

Este projeto foi desenvolvido por\*\* \*\*Veronica Ferreira como parte da disciplina de Sistemas Distribuidos, a cargo do professor Victor Alves, do curso de Analise e Desenvolvimento de Sistemas (IFSUL).
