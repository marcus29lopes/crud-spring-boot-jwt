CRUD Completo com Autenticação - Spring Boot
Introdução
Este repositório contém a implementação de um sistema de CRUD completo com autenticação utilizando Spring Boot. O projeto permite realizar operações de CRUD (Create, Read, Update, Delete) em uma base de dados relacional, com autenticação de usuários utilizando JWT (JSON Web Token).

O sistema é composto por funcionalidades para criar, ler, atualizar e excluir usuários, além de proteger rotas com autenticação e autorização, garantindo que apenas usuários autenticados possam acessar determinados recursos.

🚀 Tecnologias Utilizadas

Spring Boot
Spring Security
JWT (JSON Web Token)
Spring Data JPA
MySQL
Lombok
Maven

Objetivos
Adicionar um novo usuário ao banco de dados com autenticação.
Alterar dados de um usuário existente.
Consultar um usuário por ID.
Listar todos os usuários registrados na base de dados.
Proteger rotas usando Spring Security e JWT.
Implementar um sistema de autenticação eficiente e seguro.
Usar Spring Data JPA para gerenciamento da persistência de dados.
Garantir operações seguras com transações e EntityManager.
Funcionalidades
Adicionar um Usuário
Permite a criação de um novo usuário com nome, e-mail e senha. O usuário é registrado no banco de dados e poderá fazer login posteriormente.

Alterar um Usuário
Permite alterar os dados de um usuário existente, como nome, e-mail e senha. As alterações são refletidas no banco de dados.

Buscar um Usuário por ID
Consulta o banco de dados para recuperar um usuário específico com base no seu ID.

Listar Todos os Usuários
Retorna todos os usuários registrados na base de dados, exibindo uma lista completa.

Autenticação de Usuário com JWT
O sistema permite que usuários se autentiquem utilizando suas credenciais (e-mail e senha). Um token JWT é gerado para autenticação e proteção das rotas do sistema.
